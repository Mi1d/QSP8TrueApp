package com.example.qsp8app.databinding;
import com.example.qsp8app.R;
import com.example.qsp8app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HeaderLayoutBindingImpl extends HeaderLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.drawlayout_header, 1);
        sViewsWithIds.put(R.id.top_text_layout, 2);
        sViewsWithIds.put(R.id.top_icon, 3);
        sViewsWithIds.put(R.id.top_text, 4);
        sViewsWithIds.put(R.id.title_label_list, 5);
        sViewsWithIds.put(R.id.all_labels_layout, 6);
        sViewsWithIds.put(R.id.card_sort_note_layout, 7);
        sViewsWithIds.put(R.id.all_labels_icon, 8);
        sViewsWithIds.put(R.id.all_labels_tx, 9);
        sViewsWithIds.put(R.id.all_labels_count, 10);
        sViewsWithIds.put(R.id.drawlayout_headerlayout_recycleview, 11);
        sViewsWithIds.put(R.id.other_layout, 12);
        sViewsWithIds.put(R.id.sort_note_manager_layout, 13);
        sViewsWithIds.put(R.id.sort_note_icon, 14);
        sViewsWithIds.put(R.id.sort_tx, 15);
        sViewsWithIds.put(R.id.mine_layout, 16);
        sViewsWithIds.put(R.id.mine_icon, 17);
        sViewsWithIds.put(R.id.mine_tx, 18);
        sViewsWithIds.put(R.id.setting_layout, 19);
        sViewsWithIds.put(R.id.setting_icon, 20);
        sViewsWithIds.put(R.id.setting_tx, 21);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HeaderLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private HeaderLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[18]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.TextView) bindings[21]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.LinearLayout) bindings[2]
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