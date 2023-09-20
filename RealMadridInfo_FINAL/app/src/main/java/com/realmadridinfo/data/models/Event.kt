package com.realmadridinfo.data.models

data class Event(
    val id: Int,
    val date: Long,
    val team: String,
    val tournament: String,
    val isHome: Boolean
)
