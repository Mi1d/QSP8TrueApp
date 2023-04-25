package com.example.qsp8app.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.qsp8app.R
import com.example.qsp8app.adapter.IconListAdapter
import com.example.qsp8app.databinding.ActivityEditSortNoteBinding
import com.example.qsp8app.model.bean.SortNote
import com.example.qsp8app.model.db.DataBase
import com.example.qsp8app.util.Code
import com.example.qsp8app.util.ToastUtil.Companion.toast
import com.example.qsp8app.viewmodel.SortNoteViewModel


class EditSortNoteActivity : AppCompatActivity() {

    private var mPosition:Int = 0

    private lateinit var binding : ActivityEditSortNoteBinding

    private lateinit var clickListener: IconListAdapter.ClickListener

    private val sortNoteDao = DataBase.dataBase.sortNoteDao()

    private val labelDao = DataBase.dataBase.labelDao()

    private lateinit var adapter: IconListAdapter

    private var sortNote:SortNote? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =  DataBindingUtil.setContentView(this,R.layout.activity_edit_sort_note)

        sortNote = intent?.getParcelableExtra(Code.SORT_NOTE)
        //ViewModel
        val sortNoteViewModel = ViewModelProvider(this)[SortNoteViewModel::class.java]
        sortNoteViewModel.sortNote.value = sortNote
        binding.editSortNoteCard.viewmodelchild = sortNoteViewModel
        binding.lifecycleOwner = this

        binding.editSortNoteToolbar.setNavigationIcon(R.mipmap.back)
        binding.editSortNoteToolbar.setNavigationOnClickListener {
            finish()
        }


        val size = Code.iconList.size
        for(i in 0 until size){
            val s = resources.getResourceEntryName(Code.iconList[i])
            if(s.equals(sortNote!!.iconName)){
                mPosition = i
                break;
            }
        }




        if (sortNote != null) {
            binding.editSortNoteCard.addSortNoteEt.text = SpannableStringBuilder(sortNote!!.name)
            binding.editSortNoteCard.addSortNoteEt.setSelection(sortNote!!.name.length)
            binding.editSortNoteCard.addSortNoteEt.requestFocus()
        }


        clickListener = object :IconListAdapter.ClickListener{
            override fun onClick(position: Int) {
                mPosition = position
            }
        }


        adapter = IconListAdapter(this,clickListener,mPosition)
        val layoutManager = GridLayoutManager(this,6)


        binding.editSortNoteCard.recycleView.adapter = adapter
        binding.editSortNoteCard.recycleView.layoutManager = layoutManager


        binding.editNoteSure.setOnClickListener {
            updateSortNote()
        }

        binding.editNoteDelete.setOnClickListener {

            if(sortNote!=null){

                if(labelDao.getSameSortNoteLabelList(sortNote!!.name).isNotEmpty()){
                    this.toast("Description Failed to delete an event in the category book")
                }else{
                    sortNoteDao.deleteSortNote(sortNote!!)
                    this.toast("Deleting a class book succeeded")
                    finish()
                }

            }
        }

    }

    private fun updateSortNote() {

        val iconName = resources.getResourceEntryName(Code.iconList[mPosition])
        if(binding.editSortNoteCard.addSortNoteEt.text.isEmpty()){
            this.toast("The category text cannot be empty")
        }else{
            val sortNoteName = binding.editSortNoteCard.addSortNoteEt.text.toString()

            val lastName = sortNote!!.name

            sortNote!!.name = sortNoteName
            sortNote!!.iconName = iconName

            val nameList = sortNoteDao.getAllSortNotesName()


            if(!lastName.equals(sortNote!!.name)&&nameList.contains(sortNoteName)){
                this.toast("The classification already exists")
            }else{
                sortNoteDao.updateSortNote(sortNote!!)
                val list = labelDao.getSameSortNoteLabelList(lastName)
                for(label in list){
                    labelDao.updateLabelBySortNote(sortNoteName,label.id)
                }
                this.toast("Modifying data succeeded")
                finish()
            }
        }

    }
}