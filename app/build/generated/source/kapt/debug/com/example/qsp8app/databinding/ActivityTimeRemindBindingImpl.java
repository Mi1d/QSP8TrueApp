package com.example.qsp8app.databinding;
import com.example.qsp8app.R;
import com.example.qsp8app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTimeRemindBindingImpl extends ActivityTimeRemindBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.detail_toolbar, 1);
        sViewsWithIds.put(R.id.today_event_time_remind_layout, 2);
        sViewsWithIds.put(R.id.today_event_time_layout, 3);
        sViewsWithIds.put(R.id.today_event_time_iv, 4);
        sViewsWithIds.put(R.id.today_event_time_switch, 5);
        sViewsWithIds.put(R.id.today_event_time_date_layout, 6);
        sViewsWithIds.put(R.id.today_event_time_date, 7);
        sViewsWithIds.put(R.id.future_event_time_remind_layout, 8);
        sViewsWithIds.put(R.id.future_event_time_layout, 9);
        sViewsWithIds.put(R.id.future_today_event_time_iv, 10);
        sViewsWithIds.put(R.id.future_event_time_switch, 11);
        sViewsWithIds.put(R.id.future_event_time_date_layout, 12);
        sViewsWithIds.put(R.id.future_event_time_date, 13);
        sViewsWithIds.put(R.id.time_remind_sure, 14);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTimeRemindBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityTimeRemindBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.Toolbar) bindings[1]
            , (android.widget.TextView) bindings[13]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.RelativeLayout) bindings[9]
            , (com.google.android.material.card.MaterialCardView) bindings[8]
            , (androidx.appcompat.widget.SwitchCompat) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.Button) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.RelativeLayout) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[2]
            , (androidx.appcompat.widget.SwitchCompat) bindings[5]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
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