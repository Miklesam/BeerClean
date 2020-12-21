package com.miklesam.cleanbeer.domain

import kotlinx.coroutines.CoroutineDispatcher


interface DispatcherProvider {
    fun io(): CoroutineDispatcher
    fun computation(): CoroutineDispatcher
    fun mainThread(): CoroutineDispatcher
}