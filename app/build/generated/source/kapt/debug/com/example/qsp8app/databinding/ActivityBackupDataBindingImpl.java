package com.example.qsp8app.databinding;
import com.example.qsp8app.R;
import com.example.qsp8app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityBackupDataBindingImpl extends ActivityBackupDataBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.backup_data_toolbar, 1);
        sViewsWithIds.put(R.id.backup_picture_layout, 2);
        sViewsWithIds.put(R.id.backup_picture_icon, 3);
        sViewsWithIds.put(R.id.backup_picture_tx, 4);
        sViewsWithIds.put(R.id.line, 5);
        sViewsWithIds.put(R.id.backup_label_layout, 6);
        sViewsWithIds.put(R.id.backup_label_icon, 7);
        sViewsWithIds.put(R.id.backup_label_tx, 8);
        sViewsWithIds.put(R.id.line2, 9);
        sViewsWithIds.put(R.id.backup_sortnote_layout, 10);
        sViewsWithIds.put(R.id.backup_sortnote_icon, 11);
        sViewsWithIds.put(R.id.backup_sortnote_tx, 12);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityBackupDataBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityBackupDataBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.Toolbar) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[9]
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