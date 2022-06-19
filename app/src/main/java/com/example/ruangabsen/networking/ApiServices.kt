package com.example.ruangabsen.networking

object ApiServices {
    fun getLiveAttendanceServices(): LiveAttendanceApiServices{
        return RetrofitClient
            .getClient()
            .create(LiveAttendanceApiServices::class.java)
    }
}