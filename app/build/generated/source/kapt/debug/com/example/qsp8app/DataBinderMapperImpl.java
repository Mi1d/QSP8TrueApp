package com.example.qsp8app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.qsp8app.databinding.ActivityAddNoteBindingImpl;
import com.example.qsp8app.databinding.ActivityAddSortNoteBindingImpl;
import com.example.qsp8app.databinding.ActivityBackupDataBindingImpl;
import com.example.qsp8app.databinding.ActivityChangeAvatarBindingImpl;
import com.example.qsp8app.databinding.ActivityDarkThemeSettingBindingImpl;
import com.example.qsp8app.databinding.ActivityDetailBindingImpl;
import com.example.qsp8app.databinding.ActivityEditNoteAttributeBindingImpl;
import com.example.qsp8app.databinding.ActivityEditSortNoteBindingImpl;
import com.example.qsp8app.databinding.ActivityHomeBindingImpl;
import com.example.qsp8app.databinding.ActivityLockScreenSettingBindingImpl;
import com.example.qsp8app.databinding.ActivitySortNoteBindingImpl;
import com.example.qsp8app.databinding.ActivityTimeRemindBindingImpl;
import com.example.qsp8app.databinding.CardItemGridBindingImpl;
import com.example.qsp8app.databinding.CardItemLinearBindingImpl;
import com.example.qsp8app.databinding.FragmentMineBindingImpl;
import com.example.qsp8app.databinding.FragmentNoteListBindingImpl;
import com.example.qsp8app.databinding.FragmentNoteSortBindingImpl;
import com.example.qsp8app.databinding.FragmentSettingBindingImpl;
import com.example.qsp8app.databinding.HeaderLayoutBindingImpl;
import com.example.qsp8app.databinding.HeaderLayoutSortNoteListItemBindingImpl;
import com.example.qsp8app.databinding.IconListItemBindingImpl;
import com.example.qsp8app.databinding.NoteAttributeLayoutBindingImpl;
import com.example.qsp8app.databinding.SortNoteAttributeLayoutBindingImpl;
import com.example.qsp8app.databinding.SortNoteCardItemBindingImpl;
import com.example.qsp8app.databinding.SortNoteListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADDNOTE = 1;

  private static final int LAYOUT_ACTIVITYADDSORTNOTE = 2;

  private static final int LAYOUT_ACTIVITYBACKUPDATA = 3;

  private static final int LAYOUT_ACTIVITYCHANGEAVATAR = 4;

  private static final int LAYOUT_ACTIVITYDARKTHEMESETTING = 5;

  private static final int LAYOUT_ACTIVITYDETAIL = 6;

  private static final int LAYOUT_ACTIVITYEDITNOTEATTRIBUTE = 7;

  private static final int LAYOUT_ACTIVITYEDITSORTNOTE = 8;

  private static final int LAYOUT_ACTIVITYHOME = 9;

  private static final int LAYOUT_ACTIVITYLOCKSCREENSETTING = 10;

  private static final int LAYOUT_ACTIVITYSORTNOTE = 11;

  private static final int LAYOUT_ACTIVITYTIMEREMIND = 12;

  private static final int LAYOUT_CARDITEMGRID = 13;

  private static final int LAYOUT_CARDITEMLINEAR = 14;

  private static final int LAYOUT_FRAGMENTMINE = 15;

  private static final int LAYOUT_FRAGMENTNOTELIST = 16;

  private static final int LAYOUT_FRAGMENTNOTESORT = 17;

  private static final int LAYOUT_FRAGMENTSETTING = 18;

  private static final int LAYOUT_HEADERLAYOUT = 19;

  private static final int LAYOUT_HEADERLAYOUTSORTNOTELISTITEM = 20;

  private static final int LAYOUT_ICONLISTITEM = 21;

  private static final int LAYOUT_NOTEATTRIBUTELAYOUT = 22;

  private static final int LAYOUT_SORTNOTEATTRIBUTELAYOUT = 23;

  private static final int LAYOUT_SORTNOTECARDITEM = 24;

  private static final int LAYOUT_SORTNOTELISTITEM = 25;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(25);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_add_note, LAYOUT_ACTIVITYADDNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_add_sort_note, LAYOUT_ACTIVITYADDSORTNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_backup_data, LAYOUT_ACTIVITYBACKUPDATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_change_avatar, LAYOUT_ACTIVITYCHANGEAVATAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_dark_theme_setting, LAYOUT_ACTIVITYDARKTHEMESETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_detail, LAYOUT_ACTIVITYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_edit_note_attribute, LAYOUT_ACTIVITYEDITNOTEATTRIBUTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_edit_sort_note, LAYOUT_ACTIVITYEDITSORTNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_lock_screen_setting, LAYOUT_ACTIVITYLOCKSCREENSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_sort_note, LAYOUT_ACTIVITYSORTNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.activity_time_remind, LAYOUT_ACTIVITYTIMEREMIND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.card_item_grid, LAYOUT_CARDITEMGRID);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.card_item_linear, LAYOUT_CARDITEMLINEAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.fragment_mine, LAYOUT_FRAGMENTMINE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.fragment_note_list, LAYOUT_FRAGMENTNOTELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.fragment_note_sort, LAYOUT_FRAGMENTNOTESORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.fragment_setting, LAYOUT_FRAGMENTSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.header_layout, LAYOUT_HEADERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.header_layout_sort_note_list_item, LAYOUT_HEADERLAYOUTSORTNOTELISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.icon_list_item, LAYOUT_ICONLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.note_attribute_layout, LAYOUT_NOTEATTRIBUTELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.sort_note_attribute_layout, LAYOUT_SORTNOTEATTRIBUTELAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.sort_note_card_item, LAYOUT_SORTNOTECARDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.qsp8app.R.layout.sort_note_list_item, LAYOUT_SORTNOTELISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYADDNOTE: {
          if ("layout/activity_add_note_0".equals(tag)) {
            return new ActivityAddNoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_add_note is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYADDSORTNOTE: {
          if ("layout/activity_add_sort_note_0".equals(tag)) {
            return new ActivityAddSortNoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_add_sort_note is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYBACKUPDATA: {
          if ("layout/activity_backup_data_0".equals(tag)) {
            return new ActivityBackupDataBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_backup_data is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCHANGEAVATAR: {
          if ("layout/activity_change_avatar_0".equals(tag)) {
            return new ActivityChangeAvatarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_change_avatar is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDARKTHEMESETTING: {
          if ("layout/activity_dark_theme_setting_0".equals(tag)) {
            return new ActivityDarkThemeSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dark_theme_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDETAIL: {
          if ("layout/activity_detail_0".equals(tag)) {
            return new ActivityDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDITNOTEATTRIBUTE: {
          if ("layout/activity_edit_note_attribute_0".equals(tag)) {
            return new ActivityEditNoteAttributeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit_note_attribute is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDITSORTNOTE: {
          if ("layout/activity_edit_sort_note_0".equals(tag)) {
            return new ActivityEditSortNoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit_sort_note is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOCKSCREENSETTING: {
          if ("layout/activity_lock_screen_setting_0".equals(tag)) {
            return new ActivityLockScreenSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_lock_screen_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSORTNOTE: {
          if ("layout/activity_sort_note_0".equals(tag)) {
            return new ActivitySortNoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sort_note is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTIMEREMIND: {
          if ("layout/activity_time_remind_0".equals(tag)) {
            return new ActivityTimeRemindBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_time_remind is invalid. Received: " + tag);
        }
        case  LAYOUT_CARDITEMGRID: {
          if ("layout/card_item_grid_0".equals(tag)) {
            return new CardItemGridBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for card_item_grid is invalid. Received: " + tag);
        }
        case  LAYOUT_CARDITEMLINEAR: {
          if ("layout/card_item_linear_0".equals(tag)) {
            return new CardItemLinearBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for card_item_linear is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMINE: {
          if ("layout/fragment_mine_0".equals(tag)) {
            return new FragmentMineBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_mine is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOTELIST: {
          if ("layout/fragment_note_list_0".equals(tag)) {
            return new FragmentNoteListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_note_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOTESORT: {
          if ("layout/fragment_note_sort_0".equals(tag)) {
            return new FragmentNoteSortBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_note_sort is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTING: {
          if ("layout/fragment_setting_0".equals(tag)) {
            return new FragmentSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_HEADERLAYOUT: {
          if ("layout/header_layout_0".equals(tag)) {
            return new HeaderLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for header_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_HEADERLAYOUTSORTNOTELISTITEM: {
          if ("layout/header_layout_sort_note_list_item_0".equals(tag)) {
            return new HeaderLayoutSortNoteListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for header_layout_sort_note_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_ICONLISTITEM: {
          if ("layout/icon_list_item_0".equals(tag)) {
            return new IconListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for icon_list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_NOTEATTRIBUTELAYOUT: {
          if ("layout/note_attribute_layout_0".equals(tag)) {
            return new NoteAttributeLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for note_attribute_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_SORTNOTEATTRIBUTELAYOUT: {
          if ("layout/sort_note_attribute_layout_0".equals(tag)) {
            return new SortNoteAttributeLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sort_note_attribute_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_SORTNOTECARDITEM: {
          if ("layout/sort_note_card_item_0".equals(tag)) {
            return new SortNoteCardItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sort_note_card_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SORTNOTELISTITEM: {
          if ("layout/sort_note_list_item_0".equals(tag)) {
            return new SortNoteListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sort_note_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "label");
      sKeys.put(2, "sortnote");
      sKeys.put(3, "viewmodelchild");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(25);

    static {
      sKeys.put("layout/activity_add_note_0", com.example.qsp8app.R.layout.activity_add_note);
      sKeys.put("layout/activity_add_sort_note_0", com.example.qsp8app.R.layout.activity_add_sort_note);
      sKeys.put("layout/activity_backup_data_0", com.example.qsp8app.R.layout.activity_backup_data);
      sKeys.put("layout/activity_change_avatar_0", com.example.qsp8app.R.layout.activity_change_avatar);
      sKeys.put("layout/activity_dark_theme_setting_0", com.example.qsp8app.R.layout.activity_dark_theme_setting);
      sKeys.put("layout/activity_detail_0", com.example.qsp8app.R.layout.activity_detail);
      sKeys.put("layout/activity_edit_note_attribute_0", com.example.qsp8app.R.layout.activity_edit_note_attribute);
      sKeys.put("layout/activity_edit_sort_note_0", com.example.qsp8app.R.layout.activity_edit_sort_note);
      sKeys.put("layout/activity_home_0", com.example.qsp8app.R.layout.activity_home);
      sKeys.put("layout/activity_lock_screen_setting_0", com.example.qsp8app.R.layout.activity_lock_screen_setting);
      sKeys.put("layout/activity_sort_note_0", com.example.qsp8app.R.layout.activity_sort_note);
      sKeys.put("layout/activity_time_remind_0", com.example.qsp8app.R.layout.activity_time_remind);
      sKeys.put("layout/card_item_grid_0", com.example.qsp8app.R.layout.card_item_grid);
      sKeys.put("layout/card_item_linear_0", com.example.qsp8app.R.layout.card_item_linear);
      sKeys.put("layout/fragment_mine_0", com.example.qsp8app.R.layout.fragment_mine);
      sKeys.put("layout/fragment_note_list_0", com.example.qsp8app.R.layout.fragment_note_list);
      sKeys.put("layout/fragment_note_sort_0", com.example.qsp8app.R.layout.fragment_note_sort);
      sKeys.put("layout/fragment_setting_0", com.example.qsp8app.R.layout.fragment_setting);
      sKeys.put("layout/header_layout_0", com.example.qsp8app.R.layout.header_layout);
      sKeys.put("layout/header_layout_sort_note_list_item_0", com.example.qsp8app.R.layout.header_layout_sort_note_list_item);
      sKeys.put("layout/icon_list_item_0", com.example.qsp8app.R.layout.icon_list_item);
      sKeys.put("layout/note_attribute_layout_0", com.example.qsp8app.R.layout.note_attribute_layout);
      sKeys.put("layout/sort_note_attribute_layout_0", com.example.qsp8app.R.layout.sort_note_attribute_layout);
      sKeys.put("layout/sort_note_card_item_0", com.example.qsp8app.R.layout.sort_note_card_item);
      sKeys.put("layout/sort_note_list_item_0", com.example.qsp8app.R.layout.sort_note_list_item);
    }
  }
}
