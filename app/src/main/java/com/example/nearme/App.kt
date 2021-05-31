package com.example.nearme

import androidx.multidex.MultiDexApplication
import com.example.nearme.di.AppComponent
import com.example.nearme.di.ContextModule
import com.example.nearme.di.DaggerAppComponent

class App : MultiDexApplication() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory()
            .create(ContextModule(this))
    }

}