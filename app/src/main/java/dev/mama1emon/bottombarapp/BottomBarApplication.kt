package dev.mama1emon.bottombarapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BottomBarApplication : Application() {
//
//    var appProvider: AppProvider by Delegates.notNull()
//
//    override fun onCreate() {
//        super.onCreate()
//
//        appProvider = DaggerAppComponent.create()
//    }

}

//val Application.appProvider: AppProvider
//    get() = (this as BottomBarApplication).appProvider