package com.example.ruangabsen.networking

object ApiServices {
    fun getRuangAbsenServices(): RuangAbsenApiServices{
        return RetrofitClient
            .getClient()
            .create(RuangAbsenApiServices::class.java)
    }
}