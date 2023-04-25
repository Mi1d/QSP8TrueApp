package com.example.qsp8app.databinding;
import com.example.qsp8app.R;
import com.example.qsp8app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentNoteListBindingImpl extends FragmentNoteListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.header_layout, 1);
        sViewsWithIds.put(R.id.home_header_top_text, 2);
        sViewsWithIds.put(R.id.home_header_top_date_just_text, 3);
        sViewsWithIds.put(R.id.home_header_top_date, 4);
        sViewsWithIds.put(R.id.home_header_top_day, 5);
        sViewsWithIds.put(R.id.icon_day, 6);
        sViewsWithIds.put(R.id.line, 7);
        sViewsWithIds.put(R.id.home_label_list_layout, 8);
        sViewsWithIds.put(R.id.home_swipeRefreshLayout, 9);
        sViewsWithIds.put(R.id.home_recyclerview, 10);
        sViewsWithIds.put(R.id.list_null_logo, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentNoteListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentNoteListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.RelativeLayout) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[9]
            , (android.widget.ImageView) bindings[6]
            , (android.view.View) bindings[7]
            , (android.widget.ImageView) bindings[11]
            );
        this.drawerLayout.setTag(null);
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