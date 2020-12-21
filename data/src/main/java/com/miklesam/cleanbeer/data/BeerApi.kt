package com.miklesam.cleanbeer.data

import com.miklesam.cleanbeer.domain.Beer
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BeerApi {
    @GET("beers/random")
    suspend fun getRandomBeer(): Response<List<Beer>>

    @GET("beers/")
    suspend fun beerWithFood(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int,
        @Query("food") food: String
    ): List<Beer>

    companion object {
        const val BASE_URL = "https://api.punkapi.com/v2/"
    }
}
