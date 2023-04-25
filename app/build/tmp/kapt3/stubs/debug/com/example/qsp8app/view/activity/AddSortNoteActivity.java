package com.example.qsp8app.view.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/qsp8app/view/activity/AddSortNoteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/qsp8app/adapter/IconListAdapter;", "binding", "Lcom/example/qsp8app/databinding/ActivityAddSortNoteBinding;", "clickListener", "Lcom/example/qsp8app/adapter/IconListAdapter$ClickListener;", "mPosition", "", "sortNoteDao", "Lcom/example/qsp8app/model/db/SortNoteDao;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "saveSortNote", "app_debug"})
public final class AddSortNoteActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.qsp8app.databinding.ActivityAddSortNoteBinding binding;
    private com.example.qsp8app.adapter.IconListAdapter.ClickListener clickListener;
    private final com.example.qsp8app.model.db.SortNoteDao sortNoteDao = null;
    private com.example.qsp8app.adapter.IconListAdapter adapter;
    private int mPosition = 0;
    
    public AddSortNoteActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void saveSortNote() {
    }
}