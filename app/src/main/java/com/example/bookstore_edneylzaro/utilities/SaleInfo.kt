package com.example.bookstore_edneylzaro.utilities

import com.google.gson.annotations.SerializedName

data class SaleInfo(
    @SerializedName("country")
    var country: String,

    @SerializedName("saleability")
    var saleability: String,

    @SerializedName("isEbook")
    var isEbook: Boolean,

    @SerializedName("listPrice")
    var listPrice: ListPrice,

    @SerializedName("retailPrice")
    var retailPrice: RetailPrice,

    @SerializedName("buyLink")
    var buyLink: String,
)
