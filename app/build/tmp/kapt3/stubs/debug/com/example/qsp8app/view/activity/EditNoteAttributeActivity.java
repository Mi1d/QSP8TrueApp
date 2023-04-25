package com.example.qsp8app.view.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002J\"\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0018\u001a\n \u0019*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/qsp8app/view/activity/EditNoteAttributeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "ADD_NOTE_TIME_TAG", "", "END_TIME_TAG", "binding", "Lcom/example/qsp8app/databinding/ActivityEditNoteAttributeBinding;", "endTime", "", "Ljava/lang/Long;", "id", "", "Ljava/lang/Integer;", "isFirst", "", "label", "Lcom/example/qsp8app/model/bean/Label;", "labelDao", "Lcom/example/qsp8app/model/db/LabelDao;", "labelViewModel", "Lcom/example/qsp8app/viewmodel/LabelViewModel;", "lastChoose", "targetDayTime", "today", "kotlin.jvm.PlatformType", "changeOnTopLabel", "", "labelName", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class EditNoteAttributeActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.qsp8app.databinding.ActivityEditNoteAttributeBinding binding;
    private final java.lang.String END_TIME_TAG = "END_TIME_TAG";
    private final java.lang.String ADD_NOTE_TIME_TAG = "ADD_NOTE_TIME_TAG";
    private boolean isFirst = true;
    private java.lang.Long targetDayTime;
    private java.lang.Long endTime;
    private final java.lang.String today = null;
    private final com.example.qsp8app.model.db.LabelDao labelDao = null;
    private java.lang.Integer id;
    private com.example.qsp8app.model.bean.Label label;
    private com.example.qsp8app.viewmodel.LabelViewModel labelViewModel;
    private java.lang.String lastChoose;
    
    public EditNoteAttributeActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void changeOnTopLabel(java.lang.String labelName) {
    }
}