package com.realmadridinfo.ui.main.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u00a8\u0006\u0012"}, d2 = {"bindDate", "", "tv", "Landroid/widget/TextView;", "date", "", "bindEvents", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "standings", "", "Lcom/realmadridinfo/data/models/Event;", "bindIsHome", "isHome", "", "bindTournament", "tournament", "", "app_debug"})
public final class EventsBindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"events"})
    public static final void bindEvents(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable
    java.util.List<com.realmadridinfo.data.models.Event> standings) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"tournament"})
    public static final void bindTournament(@org.jetbrains.annotations.NotNull
    android.widget.TextView tv, @org.jetbrains.annotations.NotNull
    java.lang.String tournament) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"date"})
    public static final void bindDate(@org.jetbrains.annotations.NotNull
    android.widget.TextView tv, long date) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"isHome"})
    public static final void bindIsHome(@org.jetbrains.annotations.NotNull
    android.widget.TextView tv, boolean isHome) {
    }
}