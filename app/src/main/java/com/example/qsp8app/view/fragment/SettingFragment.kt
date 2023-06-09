package com.example.qsp8app.view.fragment

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.annotation.MenuRes
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.qsp8app.R
import com.example.qsp8app.databinding.FragmentSettingBinding
import com.example.qsp8app.model.bean.MessageEvent
import com.example.qsp8app.util.KvCommission
import com.example.qsp8app.view.activity.BackupDataActivity
import com.example.qsp8app.view.activity.DarkThemeSettingActivity
import com.example.qsp8app.view.activity.LockScreenSettingActivity
import com.example.qsp8app.view.activity.TimeRemindActivity
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class SettingFragment : Fragment() {

    private var _binding:FragmentSettingBinding ?= null
    private val binding get() = _binding!!

    private var sortStyle :String ?= null

    companion object {

        private val fragment = SettingFragment()
        @JvmStatic
        fun newInstance() = fragment
    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    @RequiresApi(Build.VERSION_CODES.M)
    private fun showMenu(v: View, @MenuRes menuRes: Int) {
        val popup = PopupMenu(requireContext(), v)
        popup.menuInflater.inflate(menuRes, popup.menu)
        popup.gravity = Gravity.RIGHT

        popup.setOnMenuItemClickListener { menuItem ->
            when (menuItem?.itemId) {
                R.id.sort_by_add_time -> {
                    sortStyle = "By add time"
                }

                R.id.sort_by_event_time -> {
                    sortStyle = "By event time"
                }

            }

            binding.sortStyle.text = sortStyle
            EventBus.getDefault().post(sortStyle?.let { MessageEvent(it) })
            popup.dismiss()

            true
        }

        popup.show()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        EventBus.getDefault().register(this)
        _binding = DataBindingUtil.inflate(LayoutInflater.from(this.context), R.layout.fragment_setting,container,false)

        val sortStyle by KvCommission( "sortStyle", "By event time")
        EventBus.getDefault().post(MessageEvent(sortStyle))
        binding.sortStyle.text = sortStyle

        val isFollowSystem by KvCommission("isFollowSystem",true)
        if(isFollowSystem){
            binding.darkThemeStyle.text = "Follow system"
        }else{
            val isDarkTheme by KvCommission("isDarkTheme",false)
            if(isDarkTheme){
                binding.darkThemeStyle.text = "dark"
            }else{
                binding.darkThemeStyle.text = "light"
            }
        }


        binding.settingSortLayout.setOnClickListener {
            showMenu(it, R.menu.fragment_setting_sort_style_menu)
        }

        binding.settingClockLayout.setOnClickListener {
            val intent = Intent(context, TimeRemindActivity::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle())
        }

        binding.settingBackupDataLayout.setOnClickListener {
            val intent = Intent(context, BackupDataActivity::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle())
        }

        binding.setLockScreenLayout.setOnClickListener {
            val intent = Intent(context, LockScreenSettingActivity::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle())
        }

        binding.settingDarkThemeLayout.setOnClickListener {
            val intent = Intent(context, DarkThemeSettingActivity::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle())
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(messageEvent: MessageEvent){

        val msg = messageEvent.msg

        when(msg){

            "By add time", "By event time" -> {
                binding.sortStyle.text = msg
                var style by KvCommission( "sortStyle", "By event time")
                style = msg
            }

            "dark" ->{
                binding.darkThemeStyle.text = "dark"
            }

            "light" ->{
                binding.darkThemeStyle.text = "light"
            }

            "Follow system" ->{
                binding.darkThemeStyle.text = "Follow system"
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}





