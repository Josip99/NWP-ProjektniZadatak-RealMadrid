package com.realmadridinfo.data.network.api.footapi.json

import com.squareup.moshi.Json

data class Player(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "proposedMarketValue") val proposedMarketValue: Int,
    @Json(name = "height") val height: Int,
    @Json(name = "jerseyNumber") val jerseyNumber: String,
    @Json(name = "position") val position: String,
    @Json(name = "preferredFoot") val preferredFoot: String,
)

data class PlayerTmp(
    @Json(name = "player") val player: Player,
)

data class Players(
    @Json(name = "players") val players: List<PlayerTmp>,
)