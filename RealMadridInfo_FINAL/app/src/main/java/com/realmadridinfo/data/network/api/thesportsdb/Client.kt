package com.realmadridinfo.data.network.api.thesportsdb

import com.realmadridinfo.data.network.api.thesportsdb.Settings.BASE_URL
import com.realmadridinfo.data.network.api.getRetrofitWithMoshi

object Client {
     private val retrofitService: Service by lazy {
        getRetrofitWithMoshi(BASE_URL, listOf()).create(Service::class.java)
    }

    suspend fun getPlayerImage(imageUrl: String): String{
        return retrofitService.getPlayerImage(imageUrl).player?.get(0)?.strThumb ?: ""
    }
}
