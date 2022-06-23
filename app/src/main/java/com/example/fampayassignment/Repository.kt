package com.example.fampayassignment

import com.example.fampayassignment.Model.ItemsDesc
import retrofit2.create

class Repository {
    var retrofit : Retrofit = Retrofit()

    fun getItems(): List<ItemsDesc> {
        return retrofit.getRetrofitInstance().create(ApiRequest::class.java).getItems()
    }
}