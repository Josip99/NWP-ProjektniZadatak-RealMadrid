package com.realmadridinfo.data.network.api.footapi.json;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006\""}, d2 = {"Lcom/realmadridinfo/data/network/api/footapi/json/Player;", "", "id", "", "name", "", "proposedMarketValue", "height", "jerseyNumber", "position", "preferredFoot", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeight", "()I", "getId", "getJerseyNumber", "()Ljava/lang/String;", "getName", "getPosition", "getPreferredFoot", "getProposedMarketValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Player {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    private final int proposedMarketValue = 0;
    private final int height = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String jerseyNumber = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String position = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String preferredFoot = null;
    
    public Player(@com.squareup.moshi.Json(name = "id")
    int id, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.NotNull
    java.lang.String name, @com.squareup.moshi.Json(name = "proposedMarketValue")
    int proposedMarketValue, @com.squareup.moshi.Json(name = "height")
    int height, @com.squareup.moshi.Json(name = "jerseyNumber")
    @org.jetbrains.annotations.NotNull
    java.lang.String jerseyNumber, @com.squareup.moshi.Json(name = "position")
    @org.jetbrains.annotations.NotNull
    java.lang.String position, @com.squareup.moshi.Json(name = "preferredFoot")
    @org.jetbrains.annotations.NotNull
    java.lang.String preferredFoot) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getProposedMarketValue() {
        return 0;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getJerseyNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPreferredFoot() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.realmadridinfo.data.network.api.footapi.json.Player copy(@com.squareup.moshi.Json(name = "id")
    int id, @com.squareup.moshi.Json(name = "name")
    @org.jetbrains.annotations.NotNull
    java.lang.String name, @com.squareup.moshi.Json(name = "proposedMarketValue")
    int proposedMarketValue, @com.squareup.moshi.Json(name = "height")
    int height, @com.squareup.moshi.Json(name = "jerseyNumber")
    @org.jetbrains.annotations.NotNull
    java.lang.String jerseyNumber, @com.squareup.moshi.Json(name = "position")
    @org.jetbrains.annotations.NotNull
    java.lang.String position, @com.squareup.moshi.Json(name = "preferredFoot")
    @org.jetbrains.annotations.NotNull
    java.lang.String preferredFoot) {
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