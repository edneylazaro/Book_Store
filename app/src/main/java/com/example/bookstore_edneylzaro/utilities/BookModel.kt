package com.example.bookstore_edneylzaro.utilities


import com.google.gson.annotations.SerializedName

data class BookModel(
    @SerializedName("kind")
    var kind: String,

    @SerializedName("id")
    var id: String,

    @SerializedName("selfLink")
    var selfLink: String,

    @SerializedName("volumeInfo")
    var volumeInfo: VolumeInfo,

    @SerializedName("userInfo")
    var userInfo: UserInfo,

    @SerializedName("saleInfo")
    var saleInfo: SaleInfo,

    @SerializedName("accessInfo")
    var accessInfo: AccessInfo
)




