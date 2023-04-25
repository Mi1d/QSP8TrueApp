package com.example.qsp8app.view.fragment

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.qsp8app.R
import com.example.qsp8app.adapter.SortNoteListAdapter
import com.example.qsp8app.databinding.FragmentNoteSortBinding
import com.example.qsp8app.model.bean.Label
import com.example.qsp8app.model.bean.SortNote
import com.example.qsp8app.model.db.DataBase
import com.example.qsp8app.model.db.LabelDao
import com.example.qsp8app.model.db.SortNoteDao
import com.example.qsp8app.util.KvCommission
import com.example.qsp8app.util.ToastUtil.Companion.toast
import com.example.qsp8app.view.activity.AddSortNoteActivity
import com.example.qsp8app.viewmodel.DataViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class NoteSortFragment : Fragment() {


    private var _binding: FragmentNoteSortBinding ?= null
    private val binding get() = _binding!!

    private lateinit var list:List<SortNote>
    private lateinit var labelList:List<Label>

    private lateinit var adapter:SortNoteListAdapter

    private lateinit var dataViewModel: DataViewModel

    private lateinit var labelDao: LabelDao
    private lateinit var sortNoteDao: SortNoteDao

    private lateinit var deleteListener:SortNoteListAdapter.deleteOnClickListener

    companion object {

        private val fragment = NoteSortFragment()

        @JvmStatic
        fun newInstance() = fragment

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)


        sortNoteDao = DataBase.dataBase.sortNoteDao()
        labelDao = DataBase.dataBase.labelDao()

        list = ArrayList()
        labelList = ArrayList()



    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.sort_note_fragment_toolbar,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       //新建分类本
        when(item.itemId){

            R.id.add_sort_note ->{
                val intent = Intent(context, AddSortNoteActivity::class.java)
                context?.startActivity(intent)
            }
        }

        return false
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = DataBindingUtil.inflate(LayoutInflater.from(this.context), R.layout.fragment_note_sort,container,false)

        deleteListener = object : SortNoteListAdapter.deleteOnClickListener {
            override fun delete(sortNote: SortNote) {
                MaterialAlertDialogBuilder(context!!)
                    .setTitle("提醒")
                    .setMessage("确定删除这个分类本?")
                    .setNegativeButton(context!!.resources.getString(R.string.decline)){ _,_ ->

                    }
                    .setPositiveButton(context!!.resources.getString(R.string.accept)) { _, _ ->
                        if(labelDao.getSameSortNoteLabelList(sortNote.name).isNotEmpty()){
                            context!!.toast("该分类本下有事件，删除失败")
                        }else{
                            sortNoteDao.deleteSortNote(sortNote)
                            context!!.toast("删除分类本成功")
                        }
                    }
                    .show()
            }
        }

        adapter = context?.let { SortNoteListAdapter(it,list,labelList,deleteListener) }!!
        binding.fragmentSortNoteRecycleview.adapter = adapter
        binding.fragmentSortNoteRecycleview.layoutManager = GridLayoutManager(context,1)

        var isFirst by KvCommission( "isFirst", true)

        if(isFirst){
            sortNoteDao.insertSortNote(SortNote("Daily",resources.getResourceEntryName(R.mipmap.cat)))
            sortNoteDao.insertSortNote(SortNote("Commemoration",resources.getResourceEntryName(R.mipmap.anniverity_color)))
            sortNoteDao.insertSortNote(SortNote("Exam",resources.getResourceEntryName(R.mipmap.cactus)))
        }

        dataViewModel = ViewModelProvider(this)[DataViewModel::class.java]

        dataViewModel.getAllSortNotesByObserve().observe(viewLifecycleOwner,{
            adapter.sortNoteList = it
            adapter.notifyDataSetChanged()
            if(isFirst){
                isFirst = false
            }
        })

        dataViewModel.getAllLabelsByObserve().observe(viewLifecycleOwner,{
            adapter.labelList = it
            adapter.notifyDataSetChanged()
        })

        binding.sortNoteListSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimaryDark)
        binding.sortNoteListSwipeRefreshLayout.setOnRefreshListener {
            adapter.notifyDataSetChanged()
            binding.sortNoteListSwipeRefreshLayout.isRefreshing = false
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}