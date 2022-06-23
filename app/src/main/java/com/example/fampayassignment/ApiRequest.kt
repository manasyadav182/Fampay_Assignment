package com.example.fampayassignment

import com.example.fampayassignment.Model.ItemsDesc
import retrofit2.http.GET


interface ApiRequest {
    @GET("5ed79368320000a0cc27498b")
    fun getItems() : List<ItemsDesc>
}