package com.realmadridinfo.data.network.api.thesportsdb;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/realmadridinfo/data/network/api/thesportsdb/Service;", "", "getPlayerImage", "Lcom/realmadridinfo/data/network/api/thesportsdb/json/PlayerImage;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface Service {
    
    @retrofit2.http.GET(value = "v1/json/3/searchplayers.php?")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPlayerImage(@retrofit2.http.Query(value = "p")
    @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.realmadridinfo.data.network.api.thesportsdb.json.PlayerImage> $completion);
}