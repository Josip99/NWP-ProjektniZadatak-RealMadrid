package com.realmadridinfo.ui.main.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0007\u001a \u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007\u001a\u001a\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"bindPoints", "", "tv", "Landroid/widget/TextView;", "points", "", "bindPosition", "position", "bindStandings", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "standings", "", "Lcom/realmadridinfo/data/models/Standing;", "bindTeam", "team", "", "app_debug"})
public final class StandingsBindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"standings"})
    public static final void bindStandings(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable
    java.util.List<com.realmadridinfo.data.models.Standing> standings) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"position"})
    public static final void bindPosition(@org.jetbrains.annotations.NotNull
    android.widget.TextView tv, int position) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"team"})
    public static final void bindTeam(@org.jetbrains.annotations.NotNull
    android.widget.TextView tv, @org.jetbrains.annotations.Nullable
    java.lang.String team) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"points"})
    public static final void bindPoints(@org.jetbrains.annotations.NotNull
    android.widget.TextView tv, int points) {
    }
}