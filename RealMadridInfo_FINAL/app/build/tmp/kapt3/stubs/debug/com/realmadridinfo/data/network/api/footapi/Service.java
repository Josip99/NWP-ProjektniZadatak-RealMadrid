package com.realmadridinfo.data.network.api.footapi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/realmadridinfo/data/network/api/footapi/Service;", "", "getEventsJson", "Lcom/realmadridinfo/data/network/api/footapi/json/Events;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlayersJson", "Lcom/realmadridinfo/data/network/api/footapi/json/Players;", "getStandingsJson", "Lcom/realmadridinfo/data/network/api/footapi/json/Standings;", "app_debug"})
public abstract interface Service {
    
    @retrofit2.http.GET(value = "tournament/8/season/52376/standings/total")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getStandingsJson(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.realmadridinfo.data.network.api.footapi.json.Standings> $completion);
    
    @retrofit2.http.GET(value = "team/2829/matches/next/0")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getEventsJson(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.realmadridinfo.data.network.api.footapi.json.Events> $completion);
    
    @retrofit2.http.GET(value = "team/2829/players")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPlayersJson(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.realmadridinfo.data.network.api.footapi.json.Players> $completion);
}