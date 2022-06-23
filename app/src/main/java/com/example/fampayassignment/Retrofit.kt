package com.example.fampayassignment

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {
    lateinit var retrofit: Retrofit


    fun getRetrofitInstance(): Retrofit{
        retrofit = Retrofit.Builder()
            .baseUrl("http://www.mocky.io/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit
    }
}