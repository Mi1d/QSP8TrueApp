package com.example.qsp8app.model.bean

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.qsp8app.util.TimeManager

@Entity(tableName = "LABEL_TABLE")
data class Label(
        @ColumnInfo var text: String,
        @ColumnInfo var targetDate: Long,
        @ColumnInfo var addNoteTime:Long
        ) : Comparable<Any>,Parcelable {

        @PrimaryKey(autoGenerate = true)
        var id:Int = 0

        @ColumnInfo
        var day = targetDate/(1000*3600*24)-System.currentTimeMillis()/(1000*3600*24)

        @ColumnInfo
        var sortNote :String = "Daily"

        @ColumnInfo
        var isTop :Boolean = false

        @ColumnInfo
        var isEnd = false

        @ColumnInfo
        var endDate:Long = Long.MAX_VALUE

    constructor(parcel: Parcel) : this(
            parcel.readString()!!,
            parcel.readLong(),
            parcel.readLong()) {
        id = parcel.readInt()
        day = parcel.readLong()
        sortNote = parcel.readString()!!
        isTop = parcel.readByte() != 0.toByte()
        isEnd = parcel.readByte() != 0.toByte()
        endDate = parcel.readLong()
    }


    override fun compareTo(other: Any): Int {
              if(this.day<(other as Label).day){
                      return 1
              }else{
                      return -1
              }
        }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, p1: Int) {
        parcel.writeString(text)
        parcel.writeLong(targetDate)
        parcel.writeLong(addNoteTime)
        parcel.writeInt(id)
        parcel.writeLong(day)
        parcel.writeString(sortNote)

        var b :Byte = if(isTop) 1 else 0
        parcel.writeByte(b)

        b = if(isEnd) 1 else 0
        parcel.writeByte(b)
        parcel.writeLong(endDate)
    }

    override fun toString(): String {
        return "Label(text='$text', targetDate=$targetDate, addNoteTime=$addNoteTime, id=$id, day=$day, sortNote='$sortNote', isTop=$isTop, isEnd=$isEnd, endDate=$endDate)"
    }

    companion object CREATOR : Parcelable.Creator<Label> {
        override fun createFromParcel(parcel: Parcel): Label {
            return Label(parcel)
        }

        override fun newArray(size: Int): Array<Label?> {
            return arrayOfNulls(size)
        }
    }

    fun refreshDay(){
        day = targetDate/(1000*3600*24)-System.currentTimeMillis()/(1000*3600*24)
    }

    fun getDate(targetDate: Long) = TimeManager.format.format(targetDate)
}


