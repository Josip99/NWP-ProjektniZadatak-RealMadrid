package com.realmadridinfo.databinding;
import com.realmadridinfo.R;
import com.realmadridinfo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlayersBindingImpl extends FragmentPlayersBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.gl_top, 2);
        sViewsWithIds.put(R.id.gl_start, 3);
        sViewsWithIds.put(R.id.gl_bottom, 4);
        sViewsWithIds.put(R.id.gl_end, 5);
        sViewsWithIds.put(R.id.pb_progress, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlayersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentPlayersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[2]
            , (android.widget.ProgressBar) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvPlayers.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.realmadridinfo.ui.main.players.PlayersViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.realmadridinfo.ui.main.players.PlayersViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPlayers((androidx.lifecycle.LiveData<java.util.List<com.realmadridinfo.data.models.Player>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPlayers(androidx.lifecycle.LiveData<java.util.List<com.realmadridinfo.data.models.Player>> ViewModelPlayers, int fieldId) {
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
        androidx.lifecycle.LiveData<java.util.List<com.realmadridinfo.data.models.Player>> viewModelPlayers = null;
        com.realmadridinfo.ui.main.players.PlayersViewModel viewModel = mViewModel;
        java.util.List<com.realmadridinfo.data.models.Player> viewModelPlayersGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.players
                    viewModelPlayers = viewModel.getPlayers();
                }
                updateLiveDataRegistration(0, viewModelPlayers);


                if (viewModelPlayers != null) {
                    // read viewModel.players.getValue()
                    viewModelPlayersGetValue = viewModelPlayers.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.realmadridinfo.ui.main.players.PlayersBindingAdaptersKt.bindRecyclerView(this.rvPlayers, viewModelPlayersGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.players
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}