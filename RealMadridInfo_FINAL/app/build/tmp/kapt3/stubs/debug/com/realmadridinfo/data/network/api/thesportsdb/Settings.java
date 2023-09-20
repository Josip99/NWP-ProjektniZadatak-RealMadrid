package com.realmadridinfo.data.network.api.thesportsdb;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/realmadridinfo/data/network/api/thesportsdb/Settings;", "", "()V", "BASE_URL", "", "ENDPOINT_PLAYERIMAGE", "app_debug"})
public final class Settings {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://www.thesportsdb.com/api/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENDPOINT_PLAYERIMAGE = "v1/json/3/searchplayers.php?";
    @org.jetbrains.annotations.NotNull
    public static final com.realmadridinfo.data.network.api.thesportsdb.Settings INSTANCE = null;
    
    private Settings() {
        super();
    }
}