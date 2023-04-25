package com.example.qsp8app.databinding;
import com.example.qsp8app.R;
import com.example.qsp8app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SortNoteListItemBindingImpl extends SortNoteListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_sort_note_layout, 1);
        sViewsWithIds.put(R.id.sort_note_linear_item_layout, 2);
        sViewsWithIds.put(R.id.sort_icon, 3);
        sViewsWithIds.put(R.id.sort_tx, 4);
        sViewsWithIds.put(R.id.sort_count, 5);
        sViewsWithIds.put(R.id.sort_note_day, 6);
        sViewsWithIds.put(R.id.sort_note_name, 7);
        sViewsWithIds.put(R.id.edit_sort_note_item, 8);
        sViewsWithIds.put(R.id.delete_sort_note_item, 9);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SortNoteListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private SortNoteListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.example.qsp8app.view.view.SwipeMenuLayout) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
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