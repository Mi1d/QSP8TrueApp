package com.example.qsp8app.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.qsp8app.R
import com.example.qsp8app.databinding.ActivityAddNoteBinding
import com.example.qsp8app.model.bean.Label
import com.example.qsp8app.model.db.DataBase
import com.example.qsp8app.util.Code
import com.example.qsp8app.util.KvCommission
import com.example.qsp8app.util.TimeManager.Companion.format
import com.example.qsp8app.util.ToastUtil.Companion.toast
import com.google.android.material.datepicker.MaterialDatePicker
import kotlin.time.ExperimentalTime


class   AddNoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNoteBinding

    private val END_TIME_TAG = "END_TIME_TAG"
    private val ADD_NOTE_TIME_TAG = "ADD_NOTE_TIME_TAG"

    private var isFirstEndTime = true

    private var targetDayTime:Long = MaterialDatePicker.todayInUtcMilliseconds()

    private var endTime:Long ?= null

    private val today = format.format(targetDayTime)

    private val labelDao = DataBase.dataBase.labelDao()
    private val sortNoteDao = DataBase.dataBase.sortNoteDao()

    private var lastChoose: String? = null


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val sortNote = data?.getStringExtra(Code.SORT_NOTE_TEXT);
        if(sortNote == null){

            if(lastChoose!=null){
                binding.noteAttributeLayout.chooseSortTv.text = lastChoose
            }else{
                initDefaultSortNoteName()
            }

        }else{
            lastChoose = sortNote
            binding.noteAttributeLayout.chooseSortTv.text = sortNote
        }
        super.onActivityResult(requestCode, resultCode, data)
    }


    private fun initDefaultSortNoteName(){
        val sortNote:String
        val sortNoteCnt =  sortNoteDao.getSortNoteCount()
        if(sortNoteCnt==0){
            sortNote = "No classifieds available"
        }else{
            sortNote = sortNoteDao.getAllSortNotes()[0].name
        }
        binding.noteAttributeLayout.chooseSortTv.text = sortNote
    }

    @ExperimentalTime
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =  DataBindingUtil.setContentView(this,R.layout.activity_add_note)
        binding.lifecycleOwner = this


        binding.noteAttributeLayout.addNoteDate.text = today

        initDefaultSortNoteName()

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


        binding.noteAttributeLayout.endTimeDate.visibility = View.GONE

        setSupportActionBar(binding.addNoteToolbar)
        binding.addNoteToolbar.setNavigationIcon(R.mipmap.back)
        binding.addNoteToolbar.setNavigationOnClickListener {
            finish()
        }

        binding.noteAttributeLayout.endTimeSwitch.setOnClickListener {

            if(isFirstEndTime){
                binding.noteAttributeLayout.endTimeDate.visibility = View.VISIBLE
                isFirstEndTime = false
            }else{
                binding.noteAttributeLayout.endTimeDate.visibility = View.GONE
                isFirstEndTime = true
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


        binding.addNoteSure.setOnClickListener {

            if(binding.noteAttributeLayout.chooseSortTv.text.equals("No classifieds available")){
                this.toast("Create an event catalog first")
            }else{
                val noteText = binding.noteAttributeLayout.addNoteEt.text.toString()
                if(noteText.isEmpty()){
                    this.toast("The event cannot be null")
                }else{

                    val todayTime = MaterialDatePicker.todayInUtcMilliseconds()
                    val addLabel = Label(noteText,targetDayTime,todayTime)

                    if(endTime!=null){
                        addLabel.isEnd = binding.noteAttributeLayout.endTimeSwitch.isChecked
                        if(addLabel.isEnd){
                            addLabel.endDate = endTime as Long
                        }
                    }

                    addLabel.isTop = binding.noteAttributeLayout.toTopSwitch.isChecked

                    var topLabelName by KvCommission("topLabelName","-1")
                    if(addLabel.isTop){

                        if(!topLabelName.equals("-1")){
                            val deleteOnTopLabel = labelDao.getLabelByName(topLabelName)
                            if(deleteOnTopLabel!=null){
                                deleteOnTopLabel.isTop = false
                                labelDao.updateLabel(deleteOnTopLabel)
                            }
                        }
                        topLabelName = addLabel.text
                    }

                    val sortNoteName = binding.noteAttributeLayout.chooseSortTv.text.toString()
                    if(sortNoteName.isNotEmpty()){
                        addLabel.sortNote = sortNoteName
                    }

                    val nameList = labelDao.getAllLabelsName()

                    if(nameList.contains(noteText)){
                        this.toast("The event already exists")
                    }else{
                        labelDao.insertLabel(addLabel)
                        this.toast("Saved data successfully")
                        finish()
                    }

                }
            }
        }

    }
}