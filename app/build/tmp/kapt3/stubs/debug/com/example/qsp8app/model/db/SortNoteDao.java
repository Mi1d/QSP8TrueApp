package com.example.qsp8app.model.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\nH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\'J\b\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/example/qsp8app/model/db/SortNoteDao;", "", "deleteAllSortNote", "", "deleteSortNote", "sortNote", "Lcom/example/qsp8app/model/bean/SortNote;", "getAllSortNotes", "", "getAllSortNotesByObserve", "Landroidx/lifecycle/LiveData;", "getAllSortNotesName", "", "getSortNoteCount", "", "insertSortNote", "updateSortNote", "app_debug"})
public abstract interface SortNoteDao {
    
    @androidx.room.Insert()
    public abstract void insertSortNote(@org.jetbrains.annotations.NotNull()
    com.example.qsp8app.model.bean.SortNote sortNote);
    
    @androidx.room.Delete()
    public abstract void deleteSortNote(@org.jetbrains.annotations.NotNull()
    com.example.qsp8app.model.bean.SortNote sortNote);
    
    @androidx.room.Query(value = "DELETE FROM sort_note_table")
    public abstract void deleteAllSortNote();
    
    @androidx.room.Update()
    public abstract void updateSortNote(@org.jetbrains.annotations.NotNull()
    com.example.qsp8app.model.bean.SortNote sortNote);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sort_note_table")
    public abstract java.util.List<com.example.qsp8app.model.bean.SortNote> getAllSortNotes();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sort_note_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.qsp8app.model.bean.SortNote>> getAllSortNotesByObserve();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT name FROM sort_note_table")
    public abstract java.util.List<java.lang.String> getAllSortNotesName();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM sort_note_table")
    public abstract int getSortNoteCount();
}