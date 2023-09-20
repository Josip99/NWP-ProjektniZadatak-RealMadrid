package com.realmadridinfo.data.network.api.footapi

object Settings {
    private const val LALIGA_ID = 8
    private const val LALIGA_SEASON_2324_ID = 52376
    const val REALMADRID_ID = 2829

    const val API_HOST = "footapi7.p.rapidapi.com"
    const val API_KEY = "6111ce1f2bmshbe1475b8f262e32p15ac3cjsn6ee016a6b98e"
    const val BASE_URL = "https://footapi7.p.rapidapi.com/api/"

    const val ENDPOINT_STANDINGS =
        "tournament/$LALIGA_ID/season/$LALIGA_SEASON_2324_ID/standings/total"

    const val ENDPOINT_EVENTS =
        "team/$REALMADRID_ID/matches/next/0"

    const val ENDPOINT_PLAYERS =
        "team/$REALMADRID_ID/players"
}