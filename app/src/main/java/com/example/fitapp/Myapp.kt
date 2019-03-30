package com.example.fitapp


import Models.useLap
import android.app.Application

class Myapp: Application() {

 val usar:  useLap = useLap()
    fun getUseLap(): useLap{
   return usar
    }/*
 companion object {
     lateinit var usar: useLap
 }

    override fun onCreate() {
        super.onCreate()
        usar=useLap()
    }}*/
}
