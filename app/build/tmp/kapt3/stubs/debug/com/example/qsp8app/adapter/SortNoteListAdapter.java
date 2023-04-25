package com.example.qsp8app.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\"\nB1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u001c\u0010\u001b\u001a\u00020\u00192\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012\u00a8\u0006#"}, d2 = {"Lcom/example/qsp8app/adapter/SortNoteListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/qsp8app/adapter/SortNoteListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "sortNoteList", "", "Lcom/example/qsp8app/model/bean/SortNote;", "labelList", "Lcom/example/qsp8app/model/bean/Label;", "deleteOnClickListener", "Lcom/example/qsp8app/adapter/SortNoteListAdapter$deleteOnClickListener;", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Lcom/example/qsp8app/adapter/SortNoteListAdapter$deleteOnClickListener;)V", "getContext", "()Landroid/content/Context;", "getLabelList", "()Ljava/util/List;", "setLabelList", "(Ljava/util/List;)V", "listener", "getSortNoteList", "setSortNoteList", "getItemCount", "", "jumpToEditActivity", "", "sortNote", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class SortNoteListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.qsp8app.adapter.SortNoteListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.qsp8app.model.bean.SortNote> sortNoteList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.qsp8app.model.bean.Label> labelList;
    private final com.example.qsp8app.adapter.SortNoteListAdapter.deleteOnClickListener listener = null;
    
    public SortNoteListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.qsp8app.model.bean.SortNote> sortNoteList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.qsp8app.model.bean.Label> labelList, @org.jetbrains.annotations.NotNull()
    com.example.qsp8app.adapter.SortNoteListAdapter.deleteOnClickListener deleteOnClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.qsp8app.model.bean.SortNote> getSortNoteList() {
        return null;
    }
    
    public final void setSortNoteList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.qsp8app.model.bean.SortNote> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.qsp8app.model.bean.Label> getLabelList() {
        return null;
    }
    
    public final void setLabelList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.qsp8app.model.bean.Label> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.qsp8app.adapter.SortNoteListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final void jumpToEditActivity(com.example.qsp8app.model.bean.SortNote sortNote) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.qsp8app.adapter.SortNoteListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/qsp8app/adapter/SortNoteListAdapter$deleteOnClickListener;", "", "delete", "", "sortNote", "Lcom/example/qsp8app/model/bean/SortNote;", "app_debug"})
    public static abstract interface deleteOnClickListener {
        
        public abstract void delete(@org.jetbrains.annotations.NotNull()
        com.example.qsp8app.model.bean.SortNote sortNote);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/qsp8app/adapter/SortNoteListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/qsp8app/databinding/SortNoteListItemBinding;", "(Lcom/example/qsp8app/adapter/SortNoteListAdapter;Lcom/example/qsp8app/databinding/SortNoteListItemBinding;)V", "deleteSortNote", "Landroid/widget/TextView;", "getDeleteSortNote", "()Landroid/widget/TextView;", "editSortNote", "getEditSortNote", "latestNoteDay", "getLatestNoteDay", "latestNoteName", "getLatestNoteName", "sortNoteCount", "getSortNoteCount", "sortNoteIcon", "Landroid/widget/ImageView;", "getSortNoteIcon", "()Landroid/widget/ImageView;", "sortNoteText", "getSortNoteText", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView sortNoteText = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView sortNoteIcon = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView sortNoteCount = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView latestNoteName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView latestNoteDay = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView editSortNote = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView deleteSortNote = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.qsp8app.databinding.SortNoteListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSortNoteText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getSortNoteIcon() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSortNoteCount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getLatestNoteName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getLatestNoteDay() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getEditSortNote() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDeleteSortNote() {
            return null;
        }
    }
}