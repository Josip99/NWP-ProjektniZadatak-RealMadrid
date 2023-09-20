package com.realmadridinfo.data.network.api.thesportsdb

import retrofit2.http.GET

import com.realmadridinfo.data.network.api.thesportsdb.Settings.ENDPOINT_PLAYERIMAGE
import com.realmadridinfo.data.network.api.thesportsdb.json.PlayerImage
import retrofit2.http.Query

interface Service {
    @GET(ENDPOINT_PLAYERIMAGE)
    suspend fun getPlayerImage(
        @Query("p") query: String
    ): PlayerImage

}