package com.realmadridinfo.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Player(
    val id: Int,
    val name: String,
    val proposedMarketValue: Int,
    val height: Int,
    val jerseyNumber: String,
    val position: String,
    val preferredFoot: String,
    var imageUrl: String = ""
): Parcelable {
    constructor():this(0,"",0,0,"", "","", "")
}
