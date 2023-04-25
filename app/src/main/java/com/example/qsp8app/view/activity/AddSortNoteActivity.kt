package com.example.qsp8app.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.qsp8app.R
import com.example.qsp8app.adapter.IconListAdapter
import com.example.qsp8app.databinding.ActivityAddSortNoteBinding
import com.example.qsp8app.model.bean.SortNote
import com.example.qsp8app.model.db.DataBase
import com.example.qsp8app.util.Code
import com.example.qsp8app.util.ToastUtil.Companion.toast

class AddSortNoteActivity : AppCompatActivity() {

    private lateinit var binding:ActivityAddSortNoteBinding

    private lateinit var clickListener: IconListAdapter.ClickListener

    private val sortNoteDao = DataBase.dataBase.sortNoteDao()

    private lateinit var adapter :IconListAdapter

    private var mPosition:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding =  DataBindingUtil.setContentView(this,R.layout.activity_add_sort_note)
        binding.lifecycleOwner = this


        binding.addSortNoteToolbar.setNavigationIcon(R.mipmap.back)
        binding.addSortNoteToolbar.setNavigationOnClickListener {
            finish()
        }


        clickListener = object :IconListAdapter.ClickListener{
            override fun onClick(position: Int) {
                mPosition = position
            }
        }



        adapter = IconListAdapter(this,clickListener,0)
        val layoutManager = GridLayoutManager(this,6)


        binding.addSortNoteCard.recycleView.adapter = adapter
        binding.addSortNoteCard.recycleView.layoutManager = layoutManager


        binding.addNoteSure.setOnClickListener {
            saveSortNote()
        }


    }


    private fun saveSortNote() {

        val iconName = resources.getResourceEntryName(Code.iconList[mPosition])
        if(binding.addSortNoteCard.addSortNoteEt.text.isEmpty()){
            this.toast("The category text cannot be empty")
        }else{

            val sortNoteName = binding.addSortNoteCard.addSortNoteEt.text.toString()

            val nameList = sortNoteDao.getAllSortNotesName()

            if(nameList.contains(sortNoteName)){
                this.toast("The classification already exists")
            }else{
                sortNoteDao.insertSortNote(SortNote(sortNoteName,iconName))
                this.toast("Saved data successfully")
                finish()
            }
        }

    }
}