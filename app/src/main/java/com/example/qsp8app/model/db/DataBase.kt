package com.example.qsp8app.model.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.qsp8app.application.MyApplication
import com.example.qsp8app.model.bean.Label
import com.example.qsp8app.model.bean.SortNote

@Database(entities = [Label::class, SortNote::class],version = 1)
abstract class DataBase : RoomDatabase(){

    abstract fun labelDao():LabelDao

    abstract fun sortNoteDao():SortNoteDao

    private object Single{

        val dataBase :DataBase = Room.databaseBuilder(
                MyApplication.getContext(),
                DataBase::class.java,
                "label_DB.db"
        )
                .allowMainThreadQueries()
                .build()

    }

    companion object{
        val dataBase = Single.dataBase
    }
}