package com.example.bookstore_edneylzaro.utilities


import com.google.gson.JsonArray
import com.google.gson.annotations.SerializedName



data class BooksResponse(
    @SerializedName("kind")
    var kind: String,

    @SerializedName("items")
    var items: JsonArray
)













