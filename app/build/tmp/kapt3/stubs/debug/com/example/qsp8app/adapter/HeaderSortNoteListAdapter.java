package com.example.qsp8app.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001e\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/example/qsp8app/adapter/HeaderSortNoteListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/qsp8app/adapter/HeaderSortNoteListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "sortNoteList", "", "Lcom/example/qsp8app/model/bean/SortNote;", "onClickListener", "Lcom/example/qsp8app/adapter/HeaderSortNoteListAdapter$OnClickListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/example/qsp8app/adapter/HeaderSortNoteListAdapter$OnClickListener;)V", "getContext", "()Landroid/content/Context;", "labelDao", "Lcom/example/qsp8app/model/db/LabelDao;", "mClickListener", "getSortNoteList", "()Ljava/util/List;", "setSortNoteList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnClickListener", "ViewHolder", "app_debug"})
public final class HeaderSortNoteListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.qsp8app.adapter.HeaderSortNoteListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.qsp8app.model.bean.SortNote> sortNoteList;
    private final com.example.qsp8app.model.db.LabelDao labelDao = null;
    private final com.example.qsp8app.adapter.HeaderSortNoteListAdapter.OnClickListener mClickListener = null;
    
    public HeaderSortNoteListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.qsp8app.model.bean.SortNote> sortNoteList, @org.jetbrains.annotations.NotNull()
    com.example.qsp8app.adapter.HeaderSortNoteListAdapter.OnClickListener onClickListener) {
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
    @java.lang.Override()
    public com.example.qsp8app.adapter.HeaderSortNoteListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.qsp8app.adapter.HeaderSortNoteListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/qsp8app/adapter/HeaderSortNoteListAdapter$OnClickListener;", "", "onClick", "", "sortNoteName", "", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        java.lang.String sortNoteName);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/qsp8app/adapter/HeaderSortNoteListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/qsp8app/adapter/HeaderSortNoteListAdapter;Landroid/view/View;)V", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}