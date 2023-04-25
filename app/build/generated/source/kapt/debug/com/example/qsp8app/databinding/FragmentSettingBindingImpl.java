package com.example.qsp8app.databinding;
import com.example.qsp8app.R;
import com.example.qsp8app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSettingBindingImpl extends FragmentSettingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.setting_dark_theme_layout, 1);
        sViewsWithIds.put(R.id.dark_theme_icon, 2);
        sViewsWithIds.put(R.id.dark_theme_tx, 3);
        sViewsWithIds.put(R.id.dark_theme_style, 4);
        sViewsWithIds.put(R.id.setting_sort_layout, 5);
        sViewsWithIds.put(R.id.sort_icon, 6);
        sViewsWithIds.put(R.id.sort_tx, 7);
        sViewsWithIds.put(R.id.sort_style, 8);
        sViewsWithIds.put(R.id.setting_clock_layout, 9);
        sViewsWithIds.put(R.id.clock_icon, 10);
        sViewsWithIds.put(R.id.clock_tx, 11);
        sViewsWithIds.put(R.id.setting_backup_data_layout, 12);
        sViewsWithIds.put(R.id.backup_data_icon, 13);
        sViewsWithIds.put(R.id.backup_data_tx, 14);
        sViewsWithIds.put(R.id.set_lock_screen_layout, 15);
        sViewsWithIds.put(R.id.set_lock_screen_icon, 16);
        sViewsWithIds.put(R.id.set_lock_screen_tx, 17);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentSettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.RelativeLayout) bindings[15]
            , (android.widget.TextView) bindings[17]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}