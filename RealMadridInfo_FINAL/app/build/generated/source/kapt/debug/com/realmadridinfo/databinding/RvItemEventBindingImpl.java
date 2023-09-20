package com.realmadridinfo.databinding;
import com.realmadridinfo.R;
import com.realmadridinfo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RvItemEventBindingImpl extends RvItemEventBinding  {

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

    public RvItemEventBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RvItemEventBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDate.setTag(null);
        this.tvIshome.setTag(null);
        this.tvName.setTag(null);
        this.tvTournament.setTag(null);
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
        if (BR.event == variableId) {
            setEvent((com.realmadridinfo.data.models.Event) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEvent(@Nullable com.realmadridinfo.data.models.Event Event) {
        this.mEvent = Event;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.event);
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
        long eventDate = 0;
        java.lang.String eventTeam = null;
        boolean eventIsHome = false;
        java.lang.String eventTournament = null;
        com.realmadridinfo.data.models.Event event = mEvent;

        if ((dirtyFlags & 0x3L) != 0) {



                if (event != null) {
                    // read event.date
                    eventDate = event.getDate();
                    // read event.team
                    eventTeam = event.getTeam();
                    // read event.isHome
                    eventIsHome = event.isHome();
                    // read event.tournament
                    eventTournament = event.getTournament();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.realmadridinfo.ui.main.home.EventsBindingAdaptersKt.bindDate(this.tvDate, eventDate);
            com.realmadridinfo.ui.main.home.EventsBindingAdaptersKt.bindIsHome(this.tvIshome, eventIsHome);
            com.realmadridinfo.ui.main.home.StandingsBindingAdaptersKt.bindTeam(this.tvName, eventTeam);
            com.realmadridinfo.ui.main.home.EventsBindingAdaptersKt.bindTournament(this.tvTournament, eventTournament);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): event
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}