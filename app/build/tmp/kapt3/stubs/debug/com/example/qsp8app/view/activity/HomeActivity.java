package com.example.qsp8app.view.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/qsp8app/view/activity/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/qsp8app/adapter/HeaderSortNoteListAdapter;", "binding", "Lcom/example/qsp8app/databinding/ActivityHomeBinding;", "clickListener", "Lcom/example/qsp8app/adapter/HeaderSortNoteListAdapter$OnClickListener;", "fragmentList", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "labelDao", "Lcom/example/qsp8app/model/db/LabelDao;", "sortNoteDao", "Lcom/example/qsp8app/model/db/SortNoteDao;", "fragmentControl", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.qsp8app.databinding.ActivityHomeBinding binding;
    private java.util.ArrayList<androidx.fragment.app.Fragment> fragmentList;
    private final com.example.qsp8app.model.db.SortNoteDao sortNoteDao = null;
    private final com.example.qsp8app.model.db.LabelDao labelDao = null;
    private com.example.qsp8app.adapter.HeaderSortNoteListAdapter adapter;
    private com.example.qsp8app.adapter.HeaderSortNoteListAdapter.OnClickListener clickListener;
    
    public HomeActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fragmentControl() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
}