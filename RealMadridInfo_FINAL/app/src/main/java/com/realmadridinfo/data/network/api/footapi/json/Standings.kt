package com.realmadridinfo.data.network.api.footapi.json

import com.squareup.moshi.Json

data class Team(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
)

data class Standing(
    @Json(name = "position") val position: Int,
    @Json(name = "team") val team: Team,
    @Json(name = "points") val points: Int,
)

data class Rows(
    @Json(name = "rows") val rows: List<Standing>,
)

data class Standings(
    @Json(name = "standings") val standings: List<Rows>,
)
