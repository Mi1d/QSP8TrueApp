// Generated by data binding compiler. Do not edit!
package com.example.qsp8app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.qsp8app.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityTimeRemindBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar detailToolbar;

  @NonNull
  public final TextView futureEventTimeDate;

  @NonNull
  public final LinearLayout futureEventTimeDateLayout;

  @NonNull
  public final RelativeLayout futureEventTimeLayout;

  @NonNull
  public final MaterialCardView futureEventTimeRemindLayout;

  @NonNull
  public final SwitchCompat futureEventTimeSwitch;

  @NonNull
  public final ImageView futureTodayEventTimeIv;

  @NonNull
  public final Button timeRemindSure;

  @NonNull
  public final TextView todayEventTimeDate;

  @NonNull
  public final LinearLayout todayEventTimeDateLayout;

  @NonNull
  public final ImageView todayEventTimeIv;

  @NonNull
  public final RelativeLayout todayEventTimeLayout;

  @NonNull
  public final MaterialCardView todayEventTimeRemindLayout;

  @NonNull
  public final SwitchCompat todayEventTimeSwitch;

  protected ActivityTimeRemindBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Toolbar detailToolbar, TextView futureEventTimeDate, LinearLayout futureEventTimeDateLayout,
      RelativeLayout futureEventTimeLayout, MaterialCardView futureEventTimeRemindLayout,
      SwitchCompat futureEventTimeSwitch, ImageView futureTodayEventTimeIv, Button timeRemindSure,
      TextView todayEventTimeDate, LinearLayout todayEventTimeDateLayout,
      ImageView todayEventTimeIv, RelativeLayout todayEventTimeLayout,
      MaterialCardView todayEventTimeRemindLayout, SwitchCompat todayEventTimeSwitch) {
    super(_bindingComponent, _root, _localFieldCount);
    this.detailToolbar = detailToolbar;
    this.futureEventTimeDate = futureEventTimeDate;
    this.futureEventTimeDateLayout = futureEventTimeDateLayout;
    this.futureEventTimeLayout = futureEventTimeLayout;
    this.futureEventTimeRemindLayout = futureEventTimeRemindLayout;
    this.futureEventTimeSwitch = futureEventTimeSwitch;
    this.futureTodayEventTimeIv = futureTodayEventTimeIv;
    this.timeRemindSure = timeRemindSure;
    this.todayEventTimeDate = todayEventTimeDate;
    this.todayEventTimeDateLayout = todayEventTimeDateLayout;
    this.todayEventTimeIv = todayEventTimeIv;
    this.todayEventTimeLayout = todayEventTimeLayout;
    this.todayEventTimeRemindLayout = todayEventTimeRemindLayout;
    this.todayEventTimeSwitch = todayEventTimeSwitch;
  }

  @NonNull
  public static ActivityTimeRemindBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_time_remind, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTimeRemindBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityTimeRemindBinding>inflateInternal(inflater, R.layout.activity_time_remind, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityTimeRemindBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_time_remind, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTimeRemindBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityTimeRemindBinding>inflateInternal(inflater, R.layout.activity_time_remind, null, false, component);
  }

  public static ActivityTimeRemindBinding bind(@NonNull View view) {
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
  public static ActivityTimeRemindBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityTimeRemindBinding)bind(component, view, R.layout.activity_time_remind);
  }
}
