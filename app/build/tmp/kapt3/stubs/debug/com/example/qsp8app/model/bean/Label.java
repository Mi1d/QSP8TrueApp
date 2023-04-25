package com.example.qsp8app.model.bean;

import java.lang.System;

@androidx.room.Entity(tableName = "LABEL_TABLE")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001=B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\u0011\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u0002H\u0096\u0002J\t\u0010/\u001a\u00020\bH\u00c6\u0003J\t\u00100\u001a\u00020\nH\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\'\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001J\b\u00103\u001a\u00020\u0018H\u0016J\u0013\u00104\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\u0016\u00105\u001a\n 6*\u0004\u0018\u00010\b0\b2\u0006\u0010\t\u001a\u00020\nJ\t\u00107\u001a\u00020\u0018H\u00d6\u0001J\u0006\u00108\u001a\u000209J\b\u0010:\u001a\u00020\bH\u0016J\u0018\u0010;\u001a\u0002092\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0018H\u0016R\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001e\u0010$\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(\u00a8\u0006>"}, d2 = {"Lcom/example/qsp8app/model/bean/Label;", "", "", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "text", "", "targetDate", "", "addNoteTime", "(Ljava/lang/String;JJ)V", "getAddNoteTime", "()J", "setAddNoteTime", "(J)V", "day", "getDay", "setDay", "endDate", "getEndDate", "setEndDate", "id", "", "getId", "()I", "setId", "(I)V", "isEnd", "", "()Z", "setEnd", "(Z)V", "isTop", "setTop", "sortNote", "getSortNote", "()Ljava/lang/String;", "setSortNote", "(Ljava/lang/String;)V", "getTargetDate", "setTargetDate", "getText", "setText", "compareTo", "other", "component1", "component2", "component3", "copy", "describeContents", "equals", "getDate", "kotlin.jvm.PlatformType", "hashCode", "refreshDay", "", "toString", "writeToParcel", "p1", "CREATOR", "app_debug"})
public final class Label implements java.lang.Comparable<java.lang.Object>, android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo()
    private java.lang.String text;
    @androidx.room.ColumnInfo()
    private long targetDate;
    @androidx.room.ColumnInfo()
    private long addNoteTime;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    @androidx.room.ColumnInfo()
    private long day;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo()
    private java.lang.String sortNote = "Daily";
    @androidx.room.ColumnInfo()
    private boolean isTop = false;
    @androidx.room.ColumnInfo()
    private boolean isEnd = false;
    @androidx.room.ColumnInfo()
    private long endDate = 9223372036854775807L;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.qsp8app.model.bean.Label.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.qsp8app.model.bean.Label copy(@org.jetbrains.annotations.NotNull()
    java.lang.String text, long targetDate, long addNoteTime) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public Label(@org.jetbrains.annotations.NotNull()
    java.lang.String text, long targetDate, long addNoteTime) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getTargetDate() {
        return 0L;
    }
    
    public final void setTargetDate(long p0) {
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getAddNoteTime() {
        return 0L;
    }
    
    public final void setAddNoteTime(long p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final long getDay() {
        return 0L;
    }
    
    public final void setDay(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSortNote() {
        return null;
    }
    
    public final void setSortNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isTop() {
        return false;
    }
    
    public final void setTop(boolean p0) {
    }
    
    public final boolean isEnd() {
        return false;
    }
    
    public final void setEnd(boolean p0) {
    }
    
    public final long getEndDate() {
        return 0L;
    }
    
    public final void setEndDate(long p0) {
    }
    
    public Label(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    java.lang.Object other) {
        return 0;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int p1) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final void refreshDay() {
    }
    
    public final java.lang.String getDate(long targetDate) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/qsp8app/model/bean/Label$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/example/qsp8app/model/bean/Label;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/example/qsp8app/model/bean/Label;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.example.qsp8app.model.bean.Label> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.qsp8app.model.bean.Label createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.qsp8app.model.bean.Label[] newArray(int size) {
            return null;
        }
    }
}