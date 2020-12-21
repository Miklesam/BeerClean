package com.miklesam.cleanbeer.data

import android.content.Context
import java.util.concurrent.TimeUnit
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DataLayerDelegate {

    fun provideApiService(): BeerApi {
        return provideRetrofit().create(BeerApi::class.java)
    }

    private fun provideRetrofit(): Retrofit {
       return Retrofit.Builder()
            .baseUrl(BeerApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}