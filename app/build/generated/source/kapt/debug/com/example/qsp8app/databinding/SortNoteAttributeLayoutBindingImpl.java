package com.example.qsp8app.databinding;
import com.example.qsp8app.R;
import com.example.qsp8app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SortNoteAttributeLayoutBindingImpl extends SortNoteAttributeLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.content_layout, 2);
        sViewsWithIds.put(R.id.choose_icon_iv, 3);
        sViewsWithIds.put(R.id.recycle_view, 4);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SortNoteAttributeLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private SortNoteAttributeLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            );
        this.addSortNoteEt.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewmodelchild == variableId) {
            setViewmodelchild((com.example.qsp8app.viewmodel.SortNoteViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodelchild(@Nullable com.example.qsp8app.viewmodel.SortNoteViewModel Viewmodelchild) {
        this.mViewmodelchild = Viewmodelchild;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodelchild);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelchildSortNote((androidx.lifecycle.MutableLiveData<com.example.qsp8app.model.bean.SortNote>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelchildSortNote(androidx.lifecycle.MutableLiveData<com.example.qsp8app.model.bean.SortNote> ViewmodelchildSortNote, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        androidx.lifecycle.MutableLiveData<com.example.qsp8app.model.bean.SortNote> viewmodelchildSortNote = null;
        com.example.qsp8app.viewmodel.SortNoteViewModel viewmodelchild = mViewmodelchild;
        java.lang.String viewmodelchildSortNoteName = null;
        com.example.qsp8app.model.bean.SortNote viewmodelchildSortNoteGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodelchild != null) {
                    // read viewmodelchild.sortNote
                    viewmodelchildSortNote = viewmodelchild.getSortNote();
                }
                updateLiveDataRegistration(0, viewmodelchildSortNote);


                if (viewmodelchildSortNote != null) {
                    // read viewmodelchild.sortNote.getValue()
                    viewmodelchildSortNoteGetValue = viewmodelchildSortNote.getValue();
                }


                if (viewmodelchildSortNoteGetValue != null) {
                    // read viewmodelchild.sortNote.getValue().name
                    viewmodelchildSortNoteName = viewmodelchildSortNoteGetValue.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addSortNoteEt, viewmodelchildSortNoteName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodelchild.sortNote
        flag 1 (0x2L): viewmodelchild
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}