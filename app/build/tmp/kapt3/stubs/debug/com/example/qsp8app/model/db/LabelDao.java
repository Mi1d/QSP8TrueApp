package com.example.qsp8app.model.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\nH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\fH\'J\b\u0010\u0013\u001a\u00020\u000fH\'J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\fH\'J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0015\u001a\u00020\fH\'J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\'\u00a8\u0006\u001d"}, d2 = {"Lcom/example/qsp8app/model/db/LabelDao;", "", "deleteAllLabel", "", "deleteLabel", "label", "Lcom/example/qsp8app/model/bean/Label;", "getAllLabels", "", "getAllLabelsByObserve", "Landroidx/lifecycle/LiveData;", "getAllLabelsName", "", "getLabel", "id", "", "getLabelById", "getLabelByName", "text", "getLabelCount", "getLabelCountBySameSort", "sortNoteName", "getSameSortNoteLabelList", "insertLabel", "updateLabel", "updateLabelByName", "name", "updateLabelBySortNote", "sortNote", "app_debug"})
public abstract interface LabelDao {
    
    @androidx.room.Insert()
    public abstract void insertLabel(@org.jetbrains.annotations.NotNull()
    com.example.qsp8app.model.bean.Label label);
    
    @androidx.room.Delete()
    public abstract void deleteLabel(@org.jetbrains.annotations.NotNull()
    com.example.qsp8app.model.bean.Label label);
    
    @androidx.room.Query(value = "DELETE FROM label_table")
    public abstract void deleteAllLabel();
    
    @androidx.room.Update()
    public abstract void updateLabel(@org.jetbrains.annotations.NotNull()
    com.example.qsp8app.model.bean.Label label);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM label_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.qsp8app.model.bean.Label>> getAllLabelsByObserve();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM label_table")
    public abstract java.util.List<com.example.qsp8app.model.bean.Label> getAllLabels();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT text FROM label_table")
    public abstract java.util.List<java.lang.String> getAllLabelsName();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM label_table WHERE sortNote =:sortNoteName ")
    public abstract java.util.List<com.example.qsp8app.model.bean.Label> getSameSortNoteLabelList(@org.jetbrains.annotations.NotNull()
    java.lang.String sortNoteName);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM label_table WHERE text =:text")
    public abstract com.example.qsp8app.model.bean.Label getLabelByName(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM label_table")
    public abstract int getLabelCount();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM label_table WHERE sortNote =:sortNoteName")
    public abstract int getLabelCountBySameSort(@org.jetbrains.annotations.NotNull()
    java.lang.String sortNoteName);
    
    @androidx.room.Query(value = "UPDATE label_table SET text =:name WHERE id =:id")
    public abstract void updateLabelByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int id);
    
    @androidx.room.Query(value = "UPDATE label_table SET sortNote =:sortNote WHERE id =:id")
    public abstract void updateLabelBySortNote(@org.jetbrains.annotations.NotNull()
    java.lang.String sortNote, int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM label_table WHERE id =:id")
    public abstract androidx.lifecycle.LiveData<com.example.qsp8app.model.bean.Label> getLabel(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM label_table WHERE id =:id")
    public abstract com.example.qsp8app.model.bean.Label getLabelById(int id);
}