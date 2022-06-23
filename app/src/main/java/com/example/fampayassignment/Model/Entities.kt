package com.example.fampayassignment.Model

import com.google.gson.annotations.SerializedName

data class Entities (

    @SerializedName("text"       ) var text      : String? = null,
    @SerializedName("type"       ) var type      : String? = null,
    @SerializedName("color"      ) var color     : String? = null,
    @SerializedName("other_url"  ) var otherUrl  : String? = null,
    @SerializedName("url_choice" ) var urlChoice : String? = null,
    @SerializedName("url"        ) var url       : String? = null

)