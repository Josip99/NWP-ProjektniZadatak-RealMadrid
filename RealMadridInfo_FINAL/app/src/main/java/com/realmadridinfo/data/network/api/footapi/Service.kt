package com.realmadridinfo.data.network.api.footapi

import retrofit2.http.GET

import com.realmadridinfo.data.network.api.footapi.Settings.ENDPOINT_EVENTS
import com.realmadridinfo.data.network.api.footapi.Settings.ENDPOINT_PLAYERS
import com.realmadridinfo.data.network.api.footapi.Settings.ENDPOINT_STANDINGS
import com.realmadridinfo.data.network.api.footapi.json.Events
import com.realmadridinfo.data.network.api.footapi.json.Players
import com.realmadridinfo.data.network.api.footapi.json.Standings

interface Service {
    @GET(ENDPOINT_STANDINGS)
    suspend fun getStandingsJson(): Standings

    @GET(ENDPOINT_EVENTS)
    suspend fun getEventsJson(): Events

    @GET(ENDPOINT_PLAYERS)
    suspend fun getPlayersJson(): Players
}