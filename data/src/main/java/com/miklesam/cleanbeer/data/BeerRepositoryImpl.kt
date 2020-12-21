package com.miklesam.cleanbeer.data

import com.miklesam.cleanbeer.domain.ApiResult
import com.miklesam.cleanbeer.domain.Beer
import com.miklesam.cleanbeer.domain.BeerRepository
import com.miklesam.cleanbeer.domain.DispatcherProvider
import kotlinx.coroutines.withContext


class BeerRepositoryImpl(
    private val dispatcherProvider: DispatcherProvider,
    private val apiService: BeerApi
) : BeerRepository {
    override suspend fun getRandomBeer(): ApiResult<List<Beer>?> {
        return withContext(dispatcherProvider.io()) {
            val ty = apiService.getRandomBeer()
            if (ty.isSuccessful) {
                ApiResult.success(ty.body())
            } else {
                ApiResult.failure(Throwable())
            }
        }

    }


}