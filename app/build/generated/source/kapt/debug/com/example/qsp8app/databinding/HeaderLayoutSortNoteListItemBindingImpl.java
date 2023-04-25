package com.example.qsp8app.databinding;
import com.example.qsp8app.R;
import com.example.qsp8app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HeaderLayoutSortNoteListItemBindingImpl extends HeaderLayoutSortNoteListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_sort_note_layout, 2);
        sViewsWithIds.put(R.id.sort_icon, 3);
        sViewsWithIds.put(R.id.sort_count, 4);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HeaderLayoutSortNoteListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private HeaderLayoutSortNoteListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.sortTx.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.sortnote == variableId) {
            setSortnote((com.example.qsp8app.model.bean.SortNote) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSortnote(@Nullable com.example.qsp8app.model.bean.SortNote Sortnote) {
        this.mSortnote = Sortnote;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.sortnote);
        super.requestRebind();
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
        com.example.qsp8app.model.bean.SortNote sortnote = mSortnote;
        java.lang.String sortnoteName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (sortnote != null) {
                    // read sortnote.name
                    sortnoteName = sortnote.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sortTx, sortnoteName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sortnote
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}