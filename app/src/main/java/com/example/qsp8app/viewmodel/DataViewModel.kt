package com.example.qsp8app.viewmodel

import androidx.lifecycle.ViewModel
import com.example.qsp8app.model.db.DataBase

class DataViewModel : ViewModel() {

    private val dataBase  = DataBase.dataBase

    private val labelDao = dataBase.labelDao()
    private val sortNoteDao = dataBase.sortNoteDao()


    fun getAllLabelsByObserve() = labelDao.getAllLabelsByObserve()

    fun getAllSortNotesByObserve() = sortNoteDao.getAllSortNotesByObserve()

    fun getLabelByid(id : Int) = labelDao.getLabel(id)

}