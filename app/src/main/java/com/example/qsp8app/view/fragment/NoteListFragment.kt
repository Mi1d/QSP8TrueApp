package com.example.qsp8app.view.fragment

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.qsp8app.adapter.LabelGridAdapter
import com.example.qsp8app.*
import com.example.qsp8app.adapter.LabelLinearAdapter
import com.example.qsp8app.databinding.FragmentNoteListBinding
import com.example.qsp8app.model.bean.Label
import com.example.qsp8app.model.bean.MessageEvent
import com.example.qsp8app.model.db.DataBase
import com.example.qsp8app.util.KvCommission
import com.example.qsp8app.util.TimeManager.Companion.format
import com.example.qsp8app.util.TimeManager.Companion.refreshRoomLabelListDay
import com.example.qsp8app.view.activity.AddNoteActivity
import com.example.qsp8app.viewmodel.DataViewModel
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.*
import kotlin.collections.ArrayList


class NoteListFragment : Fragment() {

    private lateinit var labelList : List<Label>

    private lateinit var dataViewModel: DataViewModel

    private val labelDao = DataBase.dataBase.labelDao()

    private var isFirst:Boolean = true

    private var _binding: FragmentNoteListBinding ?= null
    private val binding get() = _binding!!

    private lateinit var labelLinearAdapter:LabelLinearAdapter

    private lateinit var labelGridAdapter: LabelGridAdapter

    val targetTimeComparator = kotlin.Comparator { o1: Label, o2: Label ->
        return@Comparator o1.targetDate.compareTo(o2.targetDate)
    }

    val addTimeComparator = kotlin.Comparator { o1: Label, o2: Label ->
        return@Comparator o1.addNoteTime.compareTo(o2.addNoteTime)
    }


    companion object {

        private val fragment = NoteListFragment()

        @JvmStatic
        fun newInstance() = fragment

    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        refreshRoomLabelListDay()

        setHasOptionsMenu(true)

        labelList = ArrayList()

        val isFirst by KvCommission( "isFirst", true)

        if(isFirst){
            val calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"))
            val nextYear = calendar.get(Calendar.YEAR) + 1
            calendar.set(nextYear,0,1)
            labelDao.insertLabel(Label("New Year",calendar.timeInMillis,System.currentTimeMillis()))
        }




    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.note_list_fragment_toolbar, menu)
    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        super.onOptionsItemSelected(item)
        when(item.itemId){
            R.id.grid_note -> {

                if (isFirst) {

                    binding.homeRecyclerview.layoutManager = GridLayoutManager(this.context, 2)

                    labelGridAdapter.labelList = labelList

                    binding.homeRecyclerview.adapter = labelGridAdapter

                    binding.headerLayout.visibility = View.GONE
                    isFirst = false

                } else {

                    binding.homeRecyclerview.layoutManager = GridLayoutManager(this.context, 1)

                    labelLinearAdapter.labelList = labelList

                    binding.homeRecyclerview.adapter = labelLinearAdapter
                    binding.headerLayout.visibility = View.VISIBLE

                    isFirst = true
                }

            }

            R.id.add_note -> {
                val intent = Intent(context, AddNoteActivity::class.java)
                context?.startActivity(intent)
            }

            R.id.sort_by_event_time_home, R.id.sort_by_add_time_home -> {

                val sortStyle: String = item.title.toString()

                EventBus.getDefault().post(MessageEvent(sortStyle))

            }


        }

        return true
    }




    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        EventBus.getDefault().register(this)

        _binding = DataBindingUtil.inflate(LayoutInflater.from(this.context), R.layout.fragment_note_list,container,false)
        val style by KvCommission( "sortStyle", "By event time")

        dataViewModel = ViewModelProvider(this)[DataViewModel::class.java]

        dataViewModel.getAllLabelsByObserve().observe(viewLifecycleOwner, {
            labelList = it

            if (labelList.isEmpty()) {
                binding.listNullLogo.visibility = View.VISIBLE
            } else {
                binding.listNullLogo.visibility = View.GONE
            }

            if (style == "By event time") {
                Collections.sort(labelList, targetTimeComparator)
            } else {
                Collections.sort(labelList, addTimeComparator)
            }

            refreshTopLabel()
            refreshList()

        })

        if(style == "By event time"){
            Collections.sort(labelList, targetTimeComparator)
        }else{
            Collections.sort(labelList, addTimeComparator)
        }

        labelLinearAdapter = LabelLinearAdapter(requireContext(), labelList, false)
        labelGridAdapter = LabelGridAdapter(requireContext(), labelList)


        binding.homeRecyclerview.adapter = labelLinearAdapter
        binding.homeRecyclerview.layoutManager = GridLayoutManager(this.context, 1)

        labelLinearAdapter.notifyDataSetChanged()
        labelGridAdapter.notifyDataSetChanged()

        binding.homeSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimaryDark)
        binding.homeSwipeRefreshLayout.setOnRefreshListener {
            refreshList()
            binding.homeSwipeRefreshLayout.isRefreshing = false
        }

        refreshTopLabel()


        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(messageEvent: MessageEvent){

        val msg = messageEvent.msg

        var isChange = false

        when(msg){

            "dark","light","system" ->{

            }

            "By add time" -> {
                isChange = true
                Collections.sort(labelList, addTimeComparator)
            }

            "By event time" -> {
                isChange = true
                Collections.sort(labelList, targetTimeComparator)

            }
            "all" -> {
                labelList = labelDao.getAllLabels()
            }


            else ->{
                labelList = labelDao.getSameSortNoteLabelList(msg)
            }
        }

        if(!isChange){
            val sortStyle by KvCommission( "sortStyle", "By event time")

            if(sortStyle.equals("By add time")){
                Collections.sort(labelList, addTimeComparator)
            }else{
                Collections.sort(labelList, targetTimeComparator)
            }

        }
        refreshTopLabel()
        refreshList()
    }

    fun refreshList(){
        labelLinearAdapter.labelList = labelList
        labelLinearAdapter.notifyDataSetChanged()

        labelGridAdapter.labelList = labelList
        labelGridAdapter.notifyDataSetChanged()
    }



    @RequiresApi(Build.VERSION_CODES.M)
    fun refreshTopLabel(){

        val topEventName by KvCommission("topLabelName", "-1")

        if(topEventName.equals("-1")){
            defaultTopLabel()
        }else{
            val label: Label? = topEventName.let { labelDao.getLabelByName(it) }
            if(label!=null){
                setTopLabel(label)
            }else{
                defaultTopLabel()
            }

        }

    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun defaultTopLabel(){

        if(labelList.isNotEmpty()){

            val label = labelList.get(0)
            setTopLabel(label)
        }else{
            binding.homeHeaderTopText.text = "--"
            binding.homeHeaderTopDate.text = "----- --"
            binding.homeHeaderTopDay.text = "--"
        }
    }

    fun setTopLabel(label: Label){
        binding.homeHeaderTopText.text = label.text
        binding.homeHeaderTopDate.text = format.format(label.targetDate)

        val day = label.day

        binding.homeHeaderTopDay.text = Math.abs(day).toString()
        if(day>=0){
            binding.homeHeaderTopDateJustText.text = "Target："
        }else{
            binding.homeHeaderTopDateJustText.text = "Begin："
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}




