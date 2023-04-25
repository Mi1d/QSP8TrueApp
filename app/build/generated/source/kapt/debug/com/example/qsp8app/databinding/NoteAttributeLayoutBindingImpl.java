package com.example.qsp8app.databinding;
import com.example.qsp8app.R;
import com.example.qsp8app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NoteAttributeLayoutBindingImpl extends NoteAttributeLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.add_note_card, 4);
        sViewsWithIds.put(R.id.content_layout, 5);
        sViewsWithIds.put(R.id.add_note_date, 6);
        sViewsWithIds.put(R.id.sort_iv, 7);
        sViewsWithIds.put(R.id.sort_text, 8);
        sViewsWithIds.put(R.id.choose_sort_note_layout, 9);
        sViewsWithIds.put(R.id.choose_sort_tv, 10);
        sViewsWithIds.put(R.id.to_top_iv, 11);
        sViewsWithIds.put(R.id.end_time_card, 12);
        sViewsWithIds.put(R.id.end_time_layout, 13);
        sViewsWithIds.put(R.id.end_time_iv, 14);
        sViewsWithIds.put(R.id.end_time_text, 15);
        sViewsWithIds.put(R.id.end_time_date_layout, 16);
        sViewsWithIds.put(R.id.end_time_date, 17);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NoteAttributeLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private NoteAttributeLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[1]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.LinearLayout) bindings[5]
            , (com.google.android.material.card.MaterialCardView) bindings[12]
            , (android.widget.TextView) bindings[17]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.RelativeLayout) bindings[13]
            , (androidx.appcompat.widget.SwitchCompat) bindings[3]
            , (android.widget.TextView) bindings[15]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[11]
            , (androidx.appcompat.widget.SwitchCompat) bindings[2]
            );
        this.addNoteEt.setTag(null);
        this.endTimeSwitch.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.toTopSwitch.setTag(null);
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
            setViewmodelchild((com.example.qsp8app.viewmodel.LabelViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodelchild(@Nullable com.example.qsp8app.viewmodel.LabelViewModel Viewmodelchild) {
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
                return onChangeViewmodelchildLabel((androidx.lifecycle.MutableLiveData<com.example.qsp8app.model.bean.Label>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelchildLabel(androidx.lifecycle.MutableLiveData<com.example.qsp8app.model.bean.Label> ViewmodelchildLabel, int fieldId) {
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
        java.lang.String viewmodelchildLabelText = null;
        com.example.qsp8app.model.bean.Label viewmodelchildLabelGetValue = null;
        boolean viewmodelchildLabelEnd = false;
        boolean viewmodelchildLabelTop = false;
        com.example.qsp8app.viewmodel.LabelViewModel viewmodelchild = mViewmodelchild;
        androidx.lifecycle.MutableLiveData<com.example.qsp8app.model.bean.Label> viewmodelchildLabel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodelchild != null) {
                    // read viewmodelchild.label
                    viewmodelchildLabel = viewmodelchild.getLabel();
                }
                updateLiveDataRegistration(0, viewmodelchildLabel);


                if (viewmodelchildLabel != null) {
                    // read viewmodelchild.label.getValue()
                    viewmodelchildLabelGetValue = viewmodelchildLabel.getValue();
                }


                if (viewmodelchildLabelGetValue != null) {
                    // read viewmodelchild.label.getValue().text
                    viewmodelchildLabelText = viewmodelchildLabelGetValue.getText();
                    // read viewmodelchild.label.getValue().end
                    viewmodelchildLabelEnd = viewmodelchildLabelGetValue.isEnd();
                    // read viewmodelchild.label.getValue().top
                    viewmodelchildLabelTop = viewmodelchildLabelGetValue.isTop();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addNoteEt, viewmodelchildLabelText);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.endTimeSwitch, viewmodelchildLabelEnd);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.toTopSwitch, viewmodelchildLabelTop);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodelchild.label
        flag 1 (0x2L): viewmodelchild
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}