package com.example.qsp8app.databinding;
import com.example.qsp8app.R;
import com.example.qsp8app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CardItemGridBindingImpl extends CardItemGridBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CardItemGridBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private CardItemGridBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.labelDate.setTag(null);
        this.labelDay.setTag(null);
        this.labelText.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.label == variableId) {
            setLabel((com.example.qsp8app.model.bean.Label) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLabel(@Nullable com.example.qsp8app.model.bean.Label Label) {
        this.mLabel = Label;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.label);
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
        java.lang.String labelGetDateLabelTargetDate = null;
        long LabelDay1 = 0;
        long mathAbsLabelDay = 0;
        java.lang.String LabelText1 = null;
        long labelTargetDate = 0;
        com.example.qsp8app.model.bean.Label label = mLabel;
        java.lang.String stringValueOfMathAbsLabelDay = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (label != null) {
                    // read label.day
                    LabelDay1 = label.getDay();
                    // read label.text
                    LabelText1 = label.getText();
                    // read label.targetDate
                    labelTargetDate = label.getTargetDate();
                }


                // read Math.abs(label.day)
                mathAbsLabelDay = java.lang.Math.abs(LabelDay1);
                if (label != null) {
                    // read label.getDate(label.targetDate)
                    labelGetDateLabelTargetDate = label.getDate(labelTargetDate);
                }


                // read String.valueOf(Math.abs(label.day))
                stringValueOfMathAbsLabelDay = java.lang.String.valueOf(mathAbsLabelDay);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.labelDate, labelGetDateLabelTargetDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.labelDay, stringValueOfMathAbsLabelDay);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.labelText, LabelText1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): label
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}