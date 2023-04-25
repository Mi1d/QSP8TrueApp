package com.example.qsp8app.view.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\"\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0015J\u0012\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#H\u0015J\u0012\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0014H\u0002J\b\u0010+\u001a\u00020\u0014H\u0002J\b\u0010,\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/qsp8app/view/activity/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "binding", "Lcom/example/qsp8app/databinding/ActivityDetailBinding;", "dataViewModel", "Lcom/example/qsp8app/viewmodel/DataViewModel;", "image", "Landroid/media/Image;", "label", "Lcom/example/qsp8app/model/bean/Label;", "labelIsLock", "", "mediaProjection", "Landroid/media/projection/MediaProjection;", "mediaProjectionManager", "Landroid/media/projection/MediaProjectionManager;", "cutScreenShotToLock", "", "bitmap", "Landroid/graphics/Bitmap;", "cutScreenShotToShare", "freshLabel", "getScreenShot", "getVirtualBarHeight", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "steepStatusBar", "takeScreenShotToLock", "takeScreenShotToShare", "app_debug"})
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private final java.lang.String TAG = "DetailActivity";
    private com.example.qsp8app.viewmodel.DataViewModel dataViewModel;
    private android.media.projection.MediaProjectionManager mediaProjectionManager;
    private android.media.projection.MediaProjection mediaProjection;
    private android.media.Image image;
    private com.example.qsp8app.databinding.ActivityDetailBinding binding;
    private boolean labelIsLock = false;
    private com.example.qsp8app.model.bean.Label label;
    
    public DetailActivity() {
        super();
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final void freshLabel(com.example.qsp8app.model.bean.Label label) {
    }
    
    private final void takeScreenShotToShare() {
    }
    
    private final void takeScreenShotToLock() {
    }
    
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void steepStatusBar() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void cutScreenShotToShare(android.graphics.Bitmap bitmap) {
    }
    
    private final void cutScreenShotToLock(android.graphics.Bitmap bitmap) {
    }
    
    private final android.graphics.Bitmap getScreenShot(android.graphics.Bitmap bitmap) {
        return null;
    }
    
    private final int getVirtualBarHeight() {
        return 0;
    }
}