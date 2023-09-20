package com.realmadridinfo.ui.main.players;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001f\u0010\n\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007\u00a2\u0006\u0002\u0010\r\u001a \u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0007\u00a8\u0006\u0014"}, d2 = {"bindImage", "", "iv", "Landroid/widget/ImageView;", "imgUrl", "", "bindName", "tv", "Landroid/widget/TextView;", "name", "bindProposedMarketValue", "proposedMarketValue", "", "(Landroid/widget/TextView;Ljava/lang/Integer;)V", "bindRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "Lcom/realmadridinfo/data/models/Player;", "app_debug"})
public final class PlayersBindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"players"})
    public static final void bindRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable
    java.util.List<com.realmadridinfo.data.models.Player> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void bindImage(@org.jetbrains.annotations.NotNull
    android.widget.ImageView iv, @org.jetbrains.annotations.Nullable
    java.lang.String imgUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"name"})
    public static final void bindName(@org.jetbrains.annotations.NotNull
    android.widget.TextView tv, @org.jetbrains.annotations.Nullable
    java.lang.String name) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"proposedMarketValue"})
    public static final void bindProposedMarketValue(@org.jetbrains.annotations.NotNull
    android.widget.TextView tv, @org.jetbrains.annotations.Nullable
    java.lang.Integer proposedMarketValue) {
    }
}