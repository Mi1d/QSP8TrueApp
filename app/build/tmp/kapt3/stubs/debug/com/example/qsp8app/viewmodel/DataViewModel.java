package com.example.qsp8app.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/qsp8app/viewmodel/DataViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dataBase", "Lcom/example/qsp8app/model/db/DataBase;", "labelDao", "Lcom/example/qsp8app/model/db/LabelDao;", "sortNoteDao", "Lcom/example/qsp8app/model/db/SortNoteDao;", "getAllLabelsByObserve", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/qsp8app/model/bean/Label;", "getAllSortNotesByObserve", "Lcom/example/qsp8app/model/bean/SortNote;", "getLabelByid", "id", "", "app_debug"})
public final class DataViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.qsp8app.model.db.DataBase dataBase = null;
    private final com.example.qsp8app.model.db.LabelDao labelDao = null;
    private final com.example.qsp8app.model.db.SortNoteDao sortNoteDao = null;
    
    public DataViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.qsp8app.model.bean.Label>> getAllLabelsByObserve() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.qsp8app.model.bean.SortNote>> getAllSortNotesByObserve() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.qsp8app.model.bean.Label> getLabelByid(int id) {
        return null;
    }
}