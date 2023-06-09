// Generated by data binding compiler. Do not edit!
package com.example.qsp8app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.qsp8app.R;
import com.example.qsp8app.view.view.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityChangeAvatarBinding extends ViewDataBinding {
  @NonNull
  public final Button changeAvatarButton;

  @NonNull
  public final Toolbar changeAvatarToolbar;

  @NonNull
  public final RelativeLayout headerAvatarLayout;

  @NonNull
  public final CircleImageView mainAvatar;

  protected ActivityChangeAvatarBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button changeAvatarButton, Toolbar changeAvatarToolbar, RelativeLayout headerAvatarLayout,
      CircleImageView mainAvatar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.changeAvatarButton = changeAvatarButton;
    this.changeAvatarToolbar = changeAvatarToolbar;
    this.headerAvatarLayout = headerAvatarLayout;
    this.mainAvatar = mainAvatar;
  }

  @NonNull
  public static ActivityChangeAvatarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_change_avatar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityChangeAvatarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityChangeAvatarBinding>inflateInternal(inflater, R.layout.activity_change_avatar, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityChangeAvatarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_change_avatar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityChangeAvatarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityChangeAvatarBinding>inflateInternal(inflater, R.layout.activity_change_avatar, null, false, component);
  }

  public static ActivityChangeAvatarBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityChangeAvatarBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityChangeAvatarBinding)bind(component, view, R.layout.activity_change_avatar);
  }
}
