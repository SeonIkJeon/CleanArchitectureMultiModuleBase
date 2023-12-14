package com.example.cleanarchitecturemultimodule.view.application

import android.app.Application
import com.example.cleanarchitecturemultimodule.BuildConfig
import com.example.domain.util.TimberDebugTree
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber


@HiltAndroidApp
class SampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(TimberDebugTree())
        }
    }
}