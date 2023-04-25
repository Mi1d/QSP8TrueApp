package com.example.qsp8app.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/qsp8app/util/FileUtil;", "", "()V", "Companion", "app_debug"})
public final class FileUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.qsp8app.util.FileUtil.Companion Companion = null;
    
    public FileUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tJ\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tJ\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t\u00a8\u0006\u0019"}, d2 = {"Lcom/example/qsp8app/util/FileUtil$Companion;", "", "()V", "delete", "", "fileDir", "Ljava/io/File;", "deleteDirectory", "dir", "", "getAvatarCacheDir", "context", "Landroid/content/Context;", "getBitmapCacheDir", "getCropFile", "uri", "Landroid/net/Uri;", "isExistFile", "", "saveAvatar", "bitmap", "Landroid/graphics/Bitmap;", "bitmapName", "saveBitmap", "bitmapDir", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBitmapCacheDir(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAvatarCacheDir(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void deleteDirectory(@org.jetbrains.annotations.NotNull()
        java.lang.String dir) {
        }
        
        private final void delete(java.io.File fileDir) {
        }
        
        public final boolean isExistFile(@org.jetbrains.annotations.NotNull()
        java.lang.String dir) {
            return false;
        }
        
        public final void saveBitmap(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
        java.lang.String bitmapName) {
        }
        
        public final void saveAvatar(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
        java.lang.String bitmapName) {
        }
        
        public final void saveBitmap(@org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
        java.lang.String bitmapDir, @org.jetbrains.annotations.NotNull()
        java.lang.String bitmapName) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.io.File getCropFile(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
            return null;
        }
    }
}