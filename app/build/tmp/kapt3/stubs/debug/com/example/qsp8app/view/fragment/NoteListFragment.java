package com.example.qsp8app.view.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u0001:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J$\u0010&\u001a\u00020\'2\u0006\u0010$\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J\b\u0010+\u001a\u00020\u001dH\u0016J\b\u0010,\u001a\u00020\u001dH\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/H\u0007J\u0010\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u000202H\u0017J\u0006\u00103\u001a\u00020\u001dJ\b\u00104\u001a\u00020\u001dH\u0007J\u000e\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001a\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\n\u00a8\u00068"}, d2 = {"Lcom/example/qsp8app/view/fragment/NoteListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/qsp8app/databinding/FragmentNoteListBinding;", "addTimeComparator", "Ljava/util/Comparator;", "Lcom/example/qsp8app/model/bean/Label;", "kotlin.jvm.PlatformType", "getAddTimeComparator", "()Ljava/util/Comparator;", "binding", "getBinding", "()Lcom/example/qsp8app/databinding/FragmentNoteListBinding;", "dataViewModel", "Lcom/example/qsp8app/viewmodel/DataViewModel;", "isFirst", "", "labelDao", "Lcom/example/qsp8app/model/db/LabelDao;", "labelGridAdapter", "Lcom/example/qsp8app/adapter/LabelGridAdapter;", "labelLinearAdapter", "Lcom/example/qsp8app/adapter/LabelLinearAdapter;", "labelList", "", "targetTimeComparator", "getTargetTimeComparator", "defaultTopLabel", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onMessageEvent", "messageEvent", "Lcom/example/qsp8app/model/bean/MessageEvent;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "refreshList", "refreshTopLabel", "setTopLabel", "label", "Companion", "app_debug"})
public final class NoteListFragment extends androidx.fragment.app.Fragment {
    private java.util.List<com.example.qsp8app.model.bean.Label> labelList;
    private com.example.qsp8app.viewmodel.DataViewModel dataViewModel;
    private final com.example.qsp8app.model.db.LabelDao labelDao = null;
    private boolean isFirst = true;
    private com.example.qsp8app.databinding.FragmentNoteListBinding _binding;
    private com.example.qsp8app.adapter.LabelLinearAdapter labelLinearAdapter;
    private com.example.qsp8app.adapter.LabelGridAdapter labelGridAdapter;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Comparator<com.example.qsp8app.model.bean.Label> targetTimeComparator = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Comparator<com.example.qsp8app.model.bean.Label> addTimeComparator = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.qsp8app.view.fragment.NoteListFragment.Companion Companion = null;
    private static final com.example.qsp8app.view.fragment.NoteListFragment fragment = null;
    
    public NoteListFragment() {
        super();
    }
    
    private final com.example.qsp8app.databinding.FragmentNoteListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Comparator<com.example.qsp8app.model.bean.Label> getTargetTimeComparator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Comparator<com.example.qsp8app.model.bean.Label> getAddTimeComparator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.qsp8app.view.fragment.NoteListFragment newInstance() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    com.example.qsp8app.model.bean.MessageEvent messageEvent) {
    }
    
    public final void refreshList() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final void refreshTopLabel() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final void defaultTopLabel() {
    }
    
    public final void setTopLabel(@org.jetbrains.annotations.NotNull()
    com.example.qsp8app.model.bean.Label label) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/qsp8app/view/fragment/NoteListFragment$Companion;", "", "()V", "fragment", "Lcom/example/qsp8app/view/fragment/NoteListFragment;", "newInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.qsp8app.view.fragment.NoteListFragment newInstance() {
            return null;
        }
    }
}