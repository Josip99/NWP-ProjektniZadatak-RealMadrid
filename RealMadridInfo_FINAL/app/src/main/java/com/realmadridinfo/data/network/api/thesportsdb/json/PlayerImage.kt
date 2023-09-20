package com.realmadridinfo.data.network.api.thesportsdb.json

import com.squareup.moshi.Json

data class PlayerImageTmp(
    @Json(name = "strThumb") val strThumb: String,
)

data class PlayerImage(
    @Json(name = "player") val player: List<PlayerImageTmp>?,
)