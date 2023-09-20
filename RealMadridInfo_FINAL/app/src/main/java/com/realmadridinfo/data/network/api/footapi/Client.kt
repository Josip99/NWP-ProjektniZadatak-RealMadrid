package com.realmadridinfo.data.network.api.footapi

import com.realmadridinfo.data.network.api.HttpHeader
import com.realmadridinfo.data.network.api.footapi.Settings.API_HOST
import com.realmadridinfo.data.network.api.footapi.Settings.API_KEY
import com.realmadridinfo.data.network.api.footapi.Settings.BASE_URL
import com.realmadridinfo.data.network.api.RapidApiSettings.HEADER_KEY_HOST
import com.realmadridinfo.data.network.api.RapidApiSettings.HEADER_KEY_KEY
import com.realmadridinfo.data.models.Standing
import com.realmadridinfo.data.models.Event
import com.realmadridinfo.data.models.Player
import com.realmadridinfo.data.network.api.footapi.Settings.REALMADRID_ID
import com.realmadridinfo.data.network.api.footapi.json.Players
import com.realmadridinfo.data.network.api.getRetrofitWithMoshi
import com.squareup.moshi.Json

object Client {
     private val retrofitService: Service by lazy {
        val headers = listOf(
            HttpHeader(HEADER_KEY_HOST, API_HOST),
            HttpHeader(HEADER_KEY_KEY, API_KEY)
        )
        getRetrofitWithMoshi(BASE_URL, headers).create(Service::class.java)
    }

    suspend fun getStandings(): List<Standing>{
        return retrofitService.getStandingsJson().standings[0].rows.map {
            Standing(it.team.id, it.position, it.team.name, it.points)
        }
    }

    suspend fun getEvents(): List<Event>{
        return retrofitService.getEventsJson().events.map {
            Event(
                it.id,
                it.startTimestamp,
                if (it.awayTeam.id == REALMADRID_ID) it.homeTeam.name else it.awayTeam.name,
                it.tournament.name,
                it.homeTeam.id == REALMADRID_ID
            )
        }
    }

    suspend fun getPlayers(): List<Player>{
        return retrofitService.getPlayersJson().players.map {
            Player(
                it.player.id,
                it.player.name,
                it.player.proposedMarketValue,
                it.player.height,
                it.player.jerseyNumber,
                it.player.position,
                it.player.preferredFoot,
            )
        }
    }
}
