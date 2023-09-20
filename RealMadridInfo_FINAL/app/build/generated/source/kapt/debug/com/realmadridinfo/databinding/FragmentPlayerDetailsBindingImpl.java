package com.realmadridinfo.databinding;
import com.realmadridinfo.R;
import com.realmadridinfo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlayerDetailsBindingImpl extends FragmentPlayerDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.v_line, 8);
        sViewsWithIds.put(R.id.ll_name, 9);
        sViewsWithIds.put(R.id.tv_text_name, 10);
        sViewsWithIds.put(R.id.ll_proposedMarketValue, 11);
        sViewsWithIds.put(R.id.tv_text_proposedMarketValue, 12);
        sViewsWithIds.put(R.id.ll_height, 13);
        sViewsWithIds.put(R.id.tv_text_height, 14);
        sViewsWithIds.put(R.id.ll_jerseyNumber, 15);
        sViewsWithIds.put(R.id.tv_text_jerseyNumber, 16);
        sViewsWithIds.put(R.id.ll_position, 17);
        sViewsWithIds.put(R.id.tv_text_position, 18);
        sViewsWithIds.put(R.id.ll_preferredFoot, 19);
        sViewsWithIds.put(R.id.tv_text_preferredFoot, 20);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlayerDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentPlayerDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[12]
            , (android.view.View) bindings[8]
            );
        this.ivItemImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvHeight.setTag(null);
        this.tvJerseyNumber.setTag(null);
        this.tvName.setTag(null);
        this.tvPosition.setTag(null);
        this.tvPreferredFoot.setTag(null);
        this.tvProposedMarketValue.setTag(null);
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
        java.lang.String playerJerseyNumber = null;
        int playerHeight = 0;
        java.lang.String playerName = null;
        int playerProposedMarketValue = 0;
        java.lang.String playerPosition = null;
        java.lang.String playerPreferredFoot = null;
        java.lang.String playerImageUrl = null;
        com.realmadridinfo.data.models.Player player = mPlayer;

        if ((dirtyFlags & 0x3L) != 0) {



                if (player != null) {
                    // read player.jerseyNumber
                    playerJerseyNumber = player.getJerseyNumber();
                    // read player.height
                    playerHeight = player.getHeight();
                    // read player.name
                    playerName = player.getName();
                    // read player.proposedMarketValue
                    playerProposedMarketValue = player.getProposedMarketValue();
                    // read player.position
                    playerPosition = player.getPosition();
                    // read player.preferredFoot
                    playerPreferredFoot = player.getPreferredFoot();
                    // read player.imageUrl
                    playerImageUrl = player.getImageUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.realmadridinfo.ui.main.players.PlayersBindingAdaptersKt.bindImage(this.ivItemImage, playerImageUrl);
            com.realmadridinfo.ui.main.playerdetails.PlayerDetailsBindingAdaptersKt.bindHeight(this.tvHeight, playerHeight);
            com.realmadridinfo.ui.main.playerdetails.PlayerDetailsBindingAdaptersKt.bindJerseyNumber(this.tvJerseyNumber, playerJerseyNumber);
            com.realmadridinfo.ui.main.players.PlayersBindingAdaptersKt.bindName(this.tvName, playerName);
            com.realmadridinfo.ui.main.playerdetails.PlayerDetailsBindingAdaptersKt.bindpPosition(this.tvPosition, playerPosition);
            com.realmadridinfo.ui.main.playerdetails.PlayerDetailsBindingAdaptersKt.bindpPreferredFoot(this.tvPreferredFoot, playerPreferredFoot);
            com.realmadridinfo.ui.main.playerdetails.PlayerDetailsBindingAdaptersKt.bindProposedMarketValue(this.tvProposedMarketValue, playerProposedMarketValue);
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