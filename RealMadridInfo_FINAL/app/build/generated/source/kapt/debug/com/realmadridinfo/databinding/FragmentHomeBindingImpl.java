package com.realmadridinfo.databinding;
import com.realmadridinfo.R;
import com.realmadridinfo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.gl_top, 3);
        sViewsWithIds.put(R.id.gl_start, 4);
        sViewsWithIds.put(R.id.gl_bottom, 5);
        sViewsWithIds.put(R.id.gl_end, 6);
        sViewsWithIds.put(R.id.ll_user, 7);
        sViewsWithIds.put(R.id.tv_user, 8);
        sViewsWithIds.put(R.id.btn_logout, 9);
        sViewsWithIds.put(R.id.v_line1, 10);
        sViewsWithIds.put(R.id.tv_standings, 11);
        sViewsWithIds.put(R.id.v_line, 12);
        sViewsWithIds.put(R.id.tv_events, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[10]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvEvents.setTag(null);
        this.rvStandings.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.realmadridinfo.ui.main.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.realmadridinfo.ui.main.home.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelStandings((androidx.lifecycle.LiveData<java.util.List<com.realmadridinfo.data.models.Standing>>) object, fieldId);
            case 1 :
                return onChangeViewModelEvents((androidx.lifecycle.LiveData<java.util.List<com.realmadridinfo.data.models.Event>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelStandings(androidx.lifecycle.LiveData<java.util.List<com.realmadridinfo.data.models.Standing>> ViewModelStandings, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEvents(androidx.lifecycle.LiveData<java.util.List<com.realmadridinfo.data.models.Event>> ViewModelEvents, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.util.List<com.realmadridinfo.data.models.Event> viewModelEventsGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.realmadridinfo.data.models.Standing>> viewModelStandings = null;
        java.util.List<com.realmadridinfo.data.models.Standing> viewModelStandingsGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.realmadridinfo.data.models.Event>> viewModelEvents = null;
        com.realmadridinfo.ui.main.home.HomeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.standings
                        viewModelStandings = viewModel.getStandings();
                    }
                    updateLiveDataRegistration(0, viewModelStandings);


                    if (viewModelStandings != null) {
                        // read viewModel.standings.getValue()
                        viewModelStandingsGetValue = viewModelStandings.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.events
                        viewModelEvents = viewModel.getEvents();
                    }
                    updateLiveDataRegistration(1, viewModelEvents);


                    if (viewModelEvents != null) {
                        // read viewModel.events.getValue()
                        viewModelEventsGetValue = viewModelEvents.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.realmadridinfo.ui.main.home.EventsBindingAdaptersKt.bindEvents(this.rvEvents, viewModelEventsGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.realmadridinfo.ui.main.home.StandingsBindingAdaptersKt.bindStandings(this.rvStandings, viewModelStandingsGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.standings
        flag 1 (0x2L): viewModel.events
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}