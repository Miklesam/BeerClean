package com.miklesam.cleanbeer

import com.miklesam.cleanbeer.domain.Beer
import com.miklesam.cleanbeer.data.BeerApi
import com.miklesam.cleanbeer.data.BeerRepositoryImpl
import com.miklesam.cleanbeer.domain.BeerRepository
import com.miklesam.cleanbeer.domain.DispatcherProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
object BeerModule {

    @Provides
    @ActivityRetainedScoped
    fun provideArticleRepository(
        dispatcherProvider: DispatcherProvider,
        apiService: BeerApi
    ): BeerRepository {
        return BeerRepositoryImpl(
            dispatcherProvider,
            apiService
        )
    }
}