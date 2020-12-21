package com.miklesam.cleanbeer

import com.miklesam.cleanbeer.data.BeerApi
import com.miklesam.cleanbeer.data.DataLayerDelegate
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object DataModule {


    @Provides
    @Singleton
    fun provideApiService(): BeerApi {
        return DataLayerDelegate.provideApiService()
    }
}