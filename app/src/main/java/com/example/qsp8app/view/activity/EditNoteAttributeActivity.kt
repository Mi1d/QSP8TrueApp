package com.example.qsp8app.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.qsp8app.R
import com.example.qsp8app.databinding.ActivityEditNoteAttributeBinding
import com.example.qsp8app.model.bean.Label
import com.example.qsp8app.model.db.DataBase
import com.example.qsp8app.util.Code
import com.example.qsp8app.util.KvCommission
import com.example.qsp8app.util.TimeManager.Companion.format
import com.example.qsp8app.util.ToastUtil.Companion.toast
import com.example.qsp8app.viewmodel.LabelViewModel
import com.google.android.material.datepicker.MaterialDatePicker


class EditNoteAttributeActivity : AppCompatActivity() {

    private lateinit var binding:ActivityEditNoteAttributeBinding

    private val END_TIME_TAG = "END_TIME_TAG"
    private val ADD_NOTE_TIME_TAG = "ADD_NOTE_TIME_TAG"

    private var isFirst = true

    private var targetDayTime:Long ?= null

    private var endTime:Long ?= null

    private val today = format.format(MaterialDatePicker.todayInUtcMilliseconds())

    private val labelDao = DataBase.dataBase.labelDao()
    private var id: Int ?= null

    private lateinit var label:Label
    private lateinit var labelViewModel: LabelViewModel

    private var lastChoose: String? = null


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        var sortNote = data?.getStringExtra(Code.SORT_NOTE_TEXT);
        if(sortNote == null){
            sortNote = lastChoose
        }else{
            lastChoose = sortNote
        }
        binding.noteAttributeLayout.chooseSortTv.text = sortNote
        super.onActivityResult(requestCode, resultCode, data)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =  DataBindingUtil.setContentView(this,R.layout.activity_edit_note_attribute)

        id = intent!!.getIntExtra(Code.LABEL,0)
        label = DataBase.dataBase.labelDao().getLabelById(id!!)
        //ViewModel
        labelViewModel = ViewModelProvider(this)[LabelViewModel::class.java]
        labelViewModel.label.value = label
        binding.noteAttributeLayout.viewmodelchild = labelViewModel
        binding.lifecycleOwner = this

        binding.editNoteAttributeToolbar.setNavigationIcon(R.mipmap.back)
        binding.editNoteAttributeToolbar.setNavigationOnClickListener {
            finish()
        }


//
//        binding.noteAttributeLayout.addNoteEt.text = SpannableStringBuilder(label.text)
//        binding.noteAttributeLayout.addNoteEt.setSelection(label.text.length)
//        binding.noteAttributeLayout.addNoteEt.requestFocus()


        binding.noteAttributeLayout.chooseSortTv.text = label.sortNote

        val todayTime = MaterialDatePicker.todayInUtcMilliseconds()
        binding.noteAttributeLayout.addNoteDate.text = format.format(label.targetDate)
        targetDayTime = label.targetDate
        if(label.targetDate<todayTime){
            binding.noteAttributeLayout.addNoteDate.setTextColor(ContextCompat.getColor(this,R.color.color_passed))
        }else{
            binding.noteAttributeLayout.addNoteDate.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark))
        }

        label.sortNote.also{

            lastChoose = it
        }



        if(label.isEnd){
            endTime = label.endDate
            binding.noteAttributeLayout.endTimeDate.text = format.format(label.endDate)
            binding.noteAttributeLayout.endTimeDateLayout.visibility = View.VISIBLE

            if(label.endDate<todayTime){
                binding.noteAttributeLayout.endTimeDate.setTextColor(ContextCompat.getColor(this,R.color.color_passed))
            }else{
                binding.noteAttributeLayout.endTimeDate.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))
            }

            isFirst = false

        }else{
            binding.noteAttributeLayout.endTimeDate.text = format.format(System.currentTimeMillis())
            binding.noteAttributeLayout.endTimeDate.visibility = View.GONE
        }

        val datePicker = MaterialDatePicker.Builder.datePicker()
                .setTitleText("Select date")
                .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                .build()


        datePicker.addOnPositiveButtonClickListener {

            val chooseDay = format.format(it)

            when(datePicker.tag){

                END_TIME_TAG ->{

                    endTime = it

                    binding.noteAttributeLayout.endTimeDate.text = chooseDay
                    if(chooseDay<today){
                        binding.noteAttributeLayout.endTimeDate.setTextColor(ContextCompat.getColor(this,R.color.color_passed))
                    }else{
                        binding.noteAttributeLayout.endTimeDate.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))
                    }
                }

                ADD_NOTE_TIME_TAG ->{

                    targetDayTime = it

                    binding.noteAttributeLayout.addNoteDate.text = chooseDay
                    if(chooseDay<today){
                        binding.noteAttributeLayout.addNoteDate.setTextColor(ContextCompat.getColor(this,R.color.color_passed))
                    }else{
                        binding.noteAttributeLayout.addNoteDate.setTextColor(ContextCompat.getColor(this,R.color.colorPrimaryDark))
                    }
                }
            }

        }


        binding.noteAttributeLayout.endTimeSwitch.setOnClickListener {

            if(isFirst){
                binding.noteAttributeLayout.endTimeDate.visibility = View.VISIBLE
                isFirst = false
            }else{
                binding.noteAttributeLayout.endTimeDate.visibility = View.GONE
                isFirst = true
            }

        }


        binding.noteAttributeLayout.endTimeDate.setOnClickListener {
            datePicker.show(this.supportFragmentManager,END_TIME_TAG)
        }

        binding.noteAttributeLayout.addNoteDate.setOnClickListener {
            datePicker.show(this.supportFragmentManager,ADD_NOTE_TIME_TAG)
        }


        binding.noteAttributeLayout.chooseSortNoteLayout.setOnClickListener {
            val intent = Intent(this, SortNoteActivity::class.java)
            startActivityForResult(intent, Code.RESULT_CODE)
        }


        binding.editNoteSure.setOnClickListener {

            if(binding.noteAttributeLayout.chooseSortTv.text.equals("No classifieds available")){
                this.toast("Create an event catalog first")
            }else{
                val noteText = binding.noteAttributeLayout.addNoteEt.text.toString()
                val lastName = label.text


                if(noteText.isEmpty()){
                    this.toast("The event cannot be null")
                }else{

                    label.text = noteText

                    if(endTime!=null){
                        label.isEnd = binding.noteAttributeLayout.endTimeSwitch.isChecked
                        if(label.isEnd){
                            label.endDate = endTime as Long
                        }
                    }

                    label.isTop = binding.noteAttributeLayout.toTopSwitch.isChecked
                    label.targetDate = targetDayTime as Long
                    label.refreshDay()

                    val sortNoteName = binding.noteAttributeLayout.chooseSortTv.text.toString()
                    if(sortNoteName.isNotEmpty()){
                        label.sortNote = sortNoteName
                    }


                    val nameList = labelDao.getAllLabelsName()

                    if(lastName != noteText &&nameList.contains(noteText)){
                        this.toast("The event already exists")
                    }else{
                        if(label.isTop){
                            changeOnTopLabel(label.text)
                        }else if(lastName == noteText){
                            changeOnTopLabel("-1")
                        }
                        labelDao.updateLabel(label)
                        this.toast("Modifying data succeeded")


                        finish()
                    }

                }
            }


        }

        binding.deleteNoteSure.setOnClickListener {
            labelDao.deleteLabel(label)
            this.toast("Deleting data succeeded")
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }


    }


    private fun changeOnTopLabel(labelName : String){

        var topLabelName by KvCommission("topLabelName","-1")

        val deleteOnTopLabel = labelDao.getLabelByName(topLabelName)
        if(deleteOnTopLabel!=null){
            deleteOnTopLabel.isTop = false
            labelDao.updateLabel(deleteOnTopLabel)
        }
        topLabelName = labelName
    }
}