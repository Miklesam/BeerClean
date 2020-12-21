package com.miklesam.cleanbeer

import com.miklesam.cleanbeer.domain.DispatcherProvider
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class DispatcherProviderImpl : DispatcherProvider {
    override fun io(): CoroutineDispatcher = Dispatchers.IO
    override fun computation(): CoroutineDispatcher = Dispatchers.Default
    override fun mainThread(): CoroutineDispatcher = Dispatchers.Main
}