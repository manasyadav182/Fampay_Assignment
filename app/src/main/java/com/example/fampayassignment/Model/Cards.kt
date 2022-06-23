package com.example.fampayassignment.Model

import com.google.gson.annotations.SerializedName

data class Cards (

    @SerializedName("name"                  ) var name                 : String?               = null,
    @SerializedName("title"                 ) var title                : String?               = null,
    @SerializedName("formatted_title"       ) var formattedTitle       : FormattedTitle?       = FormattedTitle(),
    @SerializedName("description"           ) var description          : String?               = null,
    @SerializedName("formatted_description" ) var formattedDescription : FormattedDescription? = FormattedDescription(),
    @SerializedName("url"                   ) var url                  : String?               = null,
    @SerializedName("bg_image"              ) var bgImage              : BgImage?              = BgImage(),
    @SerializedName("bg_color"              ) var bgColor              : String?               = null,
    @SerializedName("cta"                   ) var cta                  : ArrayList<Cta>        = arrayListOf(),
    @SerializedName("icon") var icon : Icons = Icons()

)