package com.realmadridinfo.data.network.api.footapi.json

import com.squareup.moshi.Json

data class Tournament(
    @Json(name = "name") val name: String,
)

data class Event(
    @Json(name = "id") val id: Int,
    @Json(name = "awayTeam") val awayTeam: Team,
    @Json(name = "homeTeam") val homeTeam: Team,
    @Json(name = "tournament") val tournament: Tournament,
    @Json(name = "startTimestamp") val startTimestamp: Long,
)

data class Events(
    @Json(name = "events") val events: List<Event>,
)
