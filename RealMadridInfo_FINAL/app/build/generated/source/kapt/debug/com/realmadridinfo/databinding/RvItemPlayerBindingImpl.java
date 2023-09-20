package com.realmadridinfo.databinding;
import com.realmadridinfo.R;
import com.realmadridinfo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RvItemPlayerBindingImpl extends RvItemPlayerBinding  {

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

    public RvItemPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RvItemPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.ivItemImage.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvName.setTag(null);
        this.tvPrice.setTag(null);
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
        if (BR.player == variableId) {
            setPlayer((com.realmadridinfo.data.models.Player) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPlayer(@Nullable com.realmadridinfo.data.models.Player Player) {
        this.mPlayer = Player;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.player);
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
        java.lang.String playerName = null;
        java.lang.String playerImageUrl = null;
        com.realmadridinfo.data.models.Player player = mPlayer;
        int playerProposedMarketValue = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (player != null) {
                    // read player.name
                    playerName = player.getName();
                    // read player.imageUrl
                    playerImageUrl = player.getImageUrl();
                    // read player.proposedMarketValue
                    playerProposedMarketValue = player.getProposedMarketValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.realmadridinfo.ui.main.players.PlayersBindingAdaptersKt.bindImage(this.ivItemImage, playerImageUrl);
            com.realmadridinfo.ui.main.players.PlayersBindingAdaptersKt.bindName(this.tvName, playerName);
            com.realmadridinfo.ui.main.playerdetails.PlayerDetailsBindingAdaptersKt.bindProposedMarketValue(this.tvPrice, playerProposedMarketValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): player
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}