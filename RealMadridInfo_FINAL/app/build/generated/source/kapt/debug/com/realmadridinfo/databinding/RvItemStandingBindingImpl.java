package com.realmadridinfo.databinding;
import com.realmadridinfo.R;
import com.realmadridinfo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RvItemStandingBindingImpl extends RvItemStandingBinding  {

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

    public RvItemStandingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RvItemStandingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvName.setTag(null);
        this.tvPoints.setTag(null);
        this.tvPosition.setTag(null);
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
        if (BR.standing == variableId) {
            setStanding((com.realmadridinfo.data.models.Standing) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStanding(@Nullable com.realmadridinfo.data.models.Standing Standing) {
        this.mStanding = Standing;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.standing);
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
        java.lang.String standingTeam = null;
        com.realmadridinfo.data.models.Standing standing = mStanding;
        int standingPoints = 0;
        int standingPosition = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (standing != null) {
                    // read standing.team
                    standingTeam = standing.getTeam();
                    // read standing.points
                    standingPoints = standing.getPoints();
                    // read standing.position
                    standingPosition = standing.getPosition();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.realmadridinfo.ui.main.home.StandingsBindingAdaptersKt.bindTeam(this.tvName, standingTeam);
            com.realmadridinfo.ui.main.home.StandingsBindingAdaptersKt.bindPoints(this.tvPoints, standingPoints);
            com.realmadridinfo.ui.main.home.StandingsBindingAdaptersKt.bindPosition(this.tvPosition, standingPosition);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): standing
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}