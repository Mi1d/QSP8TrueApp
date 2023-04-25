package com.example.qsp8app.model.bean;

import java.lang.System;

@androidx.room.Entity(tableName = "SORT_NOTE_TABLE")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u000eH\u00d6\u0001J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u000eH\u0016R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f\u00a8\u0006#"}, d2 = {"Lcom/example/qsp8app/model/bean/SortNote;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "name", "", "iconName", "(Ljava/lang/String;Ljava/lang/String;)V", "getIconName", "()Ljava/lang/String;", "setIconName", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "getName", "setName", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class SortNote implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo()
    private java.lang.String iconName;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.qsp8app.model.bean.SortNote.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.qsp8app.model.bean.SortNote copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String iconName) {
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
    
    public SortNote(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String iconName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIconName() {
        return null;
    }
    
    public final void setIconName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public SortNote(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/qsp8app/model/bean/SortNote$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/example/qsp8app/model/bean/SortNote;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/example/qsp8app/model/bean/SortNote;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.example.qsp8app.model.bean.SortNote> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.qsp8app.model.bean.SortNote createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.qsp8app.model.bean.SortNote[] newArray(int size) {
            return null;
        }
    }
}