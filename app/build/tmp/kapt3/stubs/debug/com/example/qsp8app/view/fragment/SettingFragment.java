package com.example.qsp8app.view.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001a\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/qsp8app/view/fragment/SettingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/qsp8app/databinding/FragmentSettingBinding;", "binding", "getBinding", "()Lcom/example/qsp8app/databinding/FragmentSettingBinding;", "sortStyle", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onMessageEvent", "messageEvent", "Lcom/example/qsp8app/model/bean/MessageEvent;", "showMenu", "v", "menuRes", "", "Companion", "app_debug"})
public final class SettingFragment extends androidx.fragment.app.Fragment {
    private com.example.qsp8app.databinding.FragmentSettingBinding _binding;
    private java.lang.String sortStyle;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.qsp8app.view.fragment.SettingFragment.Companion Companion = null;
    private static final com.example.qsp8app.view.fragment.SettingFragment fragment = null;
    
    public SettingFragment() {
        super();
    }
    
    private final com.example.qsp8app.databinding.FragmentSettingBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.qsp8app.view.fragment.SettingFragment newInstance() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final void showMenu(android.view.View v, @androidx.annotation.MenuRes()
    int menuRes) {
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
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    com.example.qsp8app.model.bean.MessageEvent messageEvent) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/qsp8app/view/fragment/SettingFragment$Companion;", "", "()V", "fragment", "Lcom/example/qsp8app/view/fragment/SettingFragment;", "newInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.qsp8app.view.fragment.SettingFragment newInstance() {
            return null;
        }
    }
}