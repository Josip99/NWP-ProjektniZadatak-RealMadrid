package com.realmadridinfo.data.network.api.footapi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/realmadridinfo/data/network/api/footapi/Settings;", "", "()V", "API_HOST", "", "API_KEY", "BASE_URL", "ENDPOINT_EVENTS", "ENDPOINT_PLAYERS", "ENDPOINT_STANDINGS", "LALIGA_ID", "", "LALIGA_SEASON_2324_ID", "REALMADRID_ID", "app_debug"})
public final class Settings {
    private static final int LALIGA_ID = 8;
    private static final int LALIGA_SEASON_2324_ID = 52376;
    public static final int REALMADRID_ID = 2829;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_HOST = "footapi7.p.rapidapi.com";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_KEY = "6111ce1f2bmshbe1475b8f262e32p15ac3cjsn6ee016a6b98e";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://footapi7.p.rapidapi.com/api/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENDPOINT_STANDINGS = "tournament/8/season/52376/standings/total";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENDPOINT_EVENTS = "team/2829/matches/next/0";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENDPOINT_PLAYERS = "team/2829/players";
    @org.jetbrains.annotations.NotNull
    public static final com.realmadridinfo.data.network.api.footapi.Settings INSTANCE = null;
    
    private Settings() {
        super();
    }
}