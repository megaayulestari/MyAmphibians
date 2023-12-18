package com.example.myamphibians

import android.app.Application
import com.example.myamphibians.data.AppContainer
import com.example.myamphibians.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}