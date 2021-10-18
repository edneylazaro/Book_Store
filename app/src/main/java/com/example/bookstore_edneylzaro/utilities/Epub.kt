package com.example.bookstore_edneylzaro.utilities

import android.content.res.Resources
import com.google.gson.annotations.SerializedName

data class Epub(
    @SerializedName("downloadLink")
    var downloadLink: String,

    @SerializedName("acsTokenLink")
    var acsTokenLink: String,
)

//-------------------------------------------//-----------------------------------------------
data class Pdf(
    @SerializedName("downloadLink")
    var downloadLink: String,

    @SerializedName("acsTokenLink")
    var acsTokenLink: String,
)

//-------------------------------------------//-----------------------------------------------

data class ListPrice(
    @SerializedName("amount")
    var amount: Double,

    @SerializedName("currencyCode")
    var currencyCode: String
)

//-------------------------------------------//-----------------------------------------------

data class RetailPrice(
    @SerializedName("amount")
    var amount: Double,

    @SerializedName("currencyCode")
    var currencyCode: String
)

//-------------------------------------------//-----------------------------------------------
data class UserInfo(
    @SerializedName("review")
    var review: Resources,

    @SerializedName("readingPosition")
    var readingPosition: Resources,

    @SerializedName("isPurchased")
    var isPurchased: Boolean,
)

data class ImageLinks(
    @SerializedName("smallThumbnail")
    var smallThumbnail: String,

    @SerializedName("thumbnail")
    var thumbnail: String,

    @SerializedName("small")
    var small: String,

    @SerializedName("medium")
    var medium: String,

    @SerializedName("large")
    var large: String,

    @SerializedName("extraLarge")
    var extraLarge: String
)



