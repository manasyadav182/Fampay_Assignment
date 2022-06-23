package com.example.fampayassignment.Model

import com.google.gson.annotations.SerializedName

data class BgImage (

    @SerializedName("image_type" ) var imageType : String? = null,
    @SerializedName("image_url"  ) var imageUrl  : String? = null,
    @SerializedName("asset_type" ) var assetType : String? = null

)