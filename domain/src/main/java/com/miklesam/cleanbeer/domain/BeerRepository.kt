package com.miklesam.cleanbeer.domain

interface BeerRepository {
    suspend fun getRandomBeer(): ApiResult<List<Beer>?>
}