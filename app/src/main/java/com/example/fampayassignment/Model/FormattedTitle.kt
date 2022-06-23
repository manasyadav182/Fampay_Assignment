package com.example.fampayassignment.Model

import com.google.gson.annotations.SerializedName

data class FormattedTitle (

    @SerializedName("text"     ) var text     : String?             = null,
    @SerializedName("entities" ) var entities : ArrayList<Entities> = arrayListOf()

)