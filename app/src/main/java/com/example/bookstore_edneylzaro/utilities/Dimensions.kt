package com.example.bookstore_edneylzaro.utilities

import com.google.gson.annotations.SerializedName

data class Dimensions(
    @SerializedName("height")
    var height: String,

    @SerializedName("width")
    var width: String,

    @SerializedName("thickness")
    var thickness: String

)
