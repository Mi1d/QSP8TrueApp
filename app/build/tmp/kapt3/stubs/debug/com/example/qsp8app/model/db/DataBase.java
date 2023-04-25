package com.example.qsp8app.model.db;

import java.lang.System;

@androidx.room.Database(entities = {com.example.qsp8app.model.bean.Label.class, com.example.qsp8app.model.bean.SortNote.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\t"}, d2 = {"Lcom/example/qsp8app/model/db/DataBase;", "Landroidx/room/RoomDatabase;", "()V", "labelDao", "Lcom/example/qsp8app/model/db/LabelDao;", "sortNoteDao", "Lcom/example/qsp8app/model/db/SortNoteDao;", "Companion", "Single", "app_debug"})
public abstract class DataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.qsp8app.model.db.DataBase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.qsp8app.model.db.DataBase dataBase = null;
    
    public DataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.qsp8app.model.db.LabelDao labelDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.qsp8app.model.db.SortNoteDao sortNoteDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/qsp8app/model/db/DataBase$Single;", "", "()V", "dataBase", "Lcom/example/qsp8app/model/db/DataBase;", "getDataBase", "()Lcom/example/qsp8app/model/db/DataBase;", "app_debug"})
    static final class Single {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.qsp8app.model.db.DataBase.Single INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.example.qsp8app.model.db.DataBase dataBase = null;
        
        private Single() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.qsp8app.model.db.DataBase getDataBase() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/qsp8app/model/db/DataBase$Companion;", "", "()V", "dataBase", "Lcom/example/qsp8app/model/db/DataBase;", "getDataBase", "()Lcom/example/qsp8app/model/db/DataBase;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.qsp8app.model.db.DataBase getDataBase() {
            return null;
        }
    }
}