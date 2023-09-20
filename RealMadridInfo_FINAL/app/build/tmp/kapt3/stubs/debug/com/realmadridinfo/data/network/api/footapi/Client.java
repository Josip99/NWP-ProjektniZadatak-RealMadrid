package com.realmadridinfo.data.network.api.footapi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/realmadridinfo/data/network/api/footapi/Client;", "", "()V", "retrofitService", "Lcom/realmadridinfo/data/network/api/footapi/Service;", "getRetrofitService", "()Lcom/realmadridinfo/data/network/api/footapi/Service;", "retrofitService$delegate", "Lkotlin/Lazy;", "getEvents", "", "Lcom/realmadridinfo/data/models/Event;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlayers", "Lcom/realmadridinfo/data/models/Player;", "getStandings", "Lcom/realmadridinfo/data/models/Standing;", "app_debug"})
public final class Client {
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy retrofitService$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.realmadridinfo.data.network.api.footapi.Client INSTANCE = null;
    
    private Client() {
        super();
    }
    
    private final com.realmadridinfo.data.network.api.footapi.Service getRetrofitService() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getStandings(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.realmadridinfo.data.models.Standing>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getEvents(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.realmadridinfo.data.models.Event>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPlayers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.realmadridinfo.data.models.Player>> $completion) {
        return null;
    }
}