package com.realmadridinfo.data.network.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

data class HttpHeader(
    val key: String,
    val value: String
)

fun getRetrofitWithMoshi(baseUrl: String, headers: List<HttpHeader>): Retrofit {
    val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    val okHttpClient = okhttpClient(headers)

    return Retrofit.Builder()
        .client(okHttpClient)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(baseUrl)
        .build()
}

private fun loggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
    level = HttpLoggingInterceptor.Level.BODY
}

private fun okhttpClient(headers: List<HttpHeader>): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor())
        .addInterceptor { chain ->
            val originalReq = chain.request()
            var newReqBuilder = originalReq.newBuilder()
            for (header in headers)
                newReqBuilder = newReqBuilder.header(header.key, header.value)

            val newReq = newReqBuilder.build()
            chain.proceed(newReq)
        }
        .connectTimeout(5, TimeUnit.SECONDS)
        .readTimeout(5, TimeUnit.SECONDS)
        .build()
}