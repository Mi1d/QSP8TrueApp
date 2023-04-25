package com.example.qsp8app.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J>\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u000eH\u0007J&\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/example/qsp8app/util/TimeManager;", "", "()V", "getFutureRemindList", "", "Lcom/example/qsp8app/model/bean/Label;", "getTodayRemindList", "setFutureRemind", "", "remindTime", "", "alarmManager", "Landroid/app/AlarmManager;", "isLargerM", "", "context", "Landroid/content/Context;", "setRemind", "remindList", "isFuture", "setTodayRemind", "Companion", "app_debug"})
public final class TimeManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.qsp8app.util.TimeManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.SimpleDateFormat format = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.qsp8app.model.db.LabelDao labelDao = null;
    
    public TimeManager() {
        super();
    }
    
    private final java.util.List<com.example.qsp8app.model.bean.Label> getTodayRemindList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.qsp8app.model.bean.Label> getFutureRemindList() {
        return null;
    }
    
    public final void setTodayRemind(int remindTime, @org.jetbrains.annotations.NotNull()
    android.app.AlarmManager alarmManager, boolean isLargerM, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void setFutureRemind(int remindTime, @org.jetbrains.annotations.NotNull()
    android.app.AlarmManager alarmManager, boolean isLargerM, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    public final void setRemind(int remindTime, @org.jetbrains.annotations.NotNull()
    android.app.AlarmManager alarmManager, boolean isLargerM, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.qsp8app.model.bean.Label> remindList, boolean isFuture) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/example/qsp8app/util/TimeManager$Companion;", "", "()V", "format", "Ljava/text/SimpleDateFormat;", "getFormat", "()Ljava/text/SimpleDateFormat;", "labelDao", "Lcom/example/qsp8app/model/db/LabelDao;", "getLabelDao", "()Lcom/example/qsp8app/model/db/LabelDao;", "refreshRoomLabelListDay", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.text.SimpleDateFormat getFormat() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.qsp8app.model.db.LabelDao getLabelDao() {
            return null;
        }
        
        public final void refreshRoomLabelListDay() {
        }
    }
}