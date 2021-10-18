package com.example.bookstore_edneylzaro.utilities

import com.google.gson.annotations.SerializedName

data class IndustryIdentifiers(
    @SerializedName("type")
    var type: String,

    @SerializedName("identifier")
    var identifier: String
)
