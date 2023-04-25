package com.example.qsp8app.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J$\u0010\u0012\u001a\u00028\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0096\u0002\u00a2\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0011J,\u0010\u0018\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u001aR\u0010\u0010\u0006\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/example/qsp8app/util/KvCommission;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "key", "", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "mmkv", "Lcom/tencent/mmkv/MMKV;", "kotlin.jvm.PlatformType", "getMmkv", "()Lcom/tencent/mmkv/MMKV;", "mmkv$delegate", "Lkotlin/Lazy;", "cleanAllMMKV", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "removeKey", "setValue", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "app_debug"})
public final class KvCommission<T extends java.lang.Object> implements kotlin.properties.ReadWriteProperty<java.lang.Object, T> {
    private final java.lang.String key = null;
    private final T defaultValue = null;
    private final kotlin.Lazy mmkv$delegate = null;
    
    public KvCommission(@org.jetbrains.annotations.NotNull()
    java.lang.String key, T defaultValue) {
        super();
    }
    
    private final com.tencent.mmkv.MMKV getMmkv() {
        return null;
    }
    
    @java.lang.Override()
    public T getValue(@org.jetbrains.annotations.Nullable()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.Nullable()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property, T value) {
    }
    
    public final void removeKey() {
    }
    
    public final void cleanAllMMKV() {
    }
}