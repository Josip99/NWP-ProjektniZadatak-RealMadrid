package com.realmadridinfo.data.network.api.footapi.json;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/realmadridinfo/data/network/api/footapi/json/Standing;", "", "position", "", "team", "Lcom/realmadridinfo/data/network/api/footapi/json/Team;", "points", "(ILcom/realmadridinfo/data/network/api/footapi/json/Team;I)V", "getPoints", "()I", "getPosition", "getTeam", "()Lcom/realmadridinfo/data/network/api/footapi/json/Team;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Standing {
    private final int position = 0;
    @org.jetbrains.annotations.NotNull
    private final com.realmadridinfo.data.network.api.footapi.json.Team team = null;
    private final int points = 0;
    
    public Standing(@com.squareup.moshi.Json(name = "position")
    int position, @com.squareup.moshi.Json(name = "team")
    @org.jetbrains.annotations.NotNull
    com.realmadridinfo.data.network.api.footapi.json.Team team, @com.squareup.moshi.Json(name = "points")
    int points) {
        super();
    }
    
    public final int getPosition() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.realmadridinfo.data.network.api.footapi.json.Team getTeam() {
        return null;
    }
    
    public final int getPoints() {
        return 0;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.realmadridinfo.data.network.api.footapi.json.Team component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.realmadridinfo.data.network.api.footapi.json.Standing copy(@com.squareup.moshi.Json(name = "position")
    int position, @com.squareup.moshi.Json(name = "team")
    @org.jetbrains.annotations.NotNull
    com.realmadridinfo.data.network.api.footapi.json.Team team, @com.squareup.moshi.Json(name = "points")
    int points) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}