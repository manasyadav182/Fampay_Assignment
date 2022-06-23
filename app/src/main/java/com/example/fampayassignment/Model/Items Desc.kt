package com.example.fampayassignment.Model

import com.google.gson.annotations.SerializedName

data class ItemsDesc(
    @SerializedName("id"            ) var id           : Int?             = null,
    @SerializedName("name"          ) var name         : String?          = null,
    @SerializedName("design_type"   ) var designType   : String?          = null,
    @SerializedName("card_type"     ) var cardType     : Int?             = null,
    @SerializedName("cards"         ) var cards        : ArrayList<Cards> = arrayListOf(),
    @SerializedName("is_scrollable" ) var isScrollable : Boolean?         = null
)