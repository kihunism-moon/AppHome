package com.example.appkotlin

import android.app.Application
import android.content.Context

class MainApplication: Application() {
    lateinit var context: Context
    init {
        instance = this
    }

    companion object{
        private var instance: MainApplication? = null
        fun getAppContext(): Context {
            return instance!!.applicationContext
        }
    }

}