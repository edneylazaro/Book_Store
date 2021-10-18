package com.example.bookstore_edneylzaro.utilities

import com.google.gson.annotations.SerializedName

data class AccessInfo(
    @SerializedName("country")
    var country: String,

    @SerializedName("viewability")
    var viewability: String,

    @SerializedName("epub")
    var epub: Epub,

    @SerializedName("pdf")
    var pdf: Pdf,

    @SerializedName("accessViewStatus")
    var accessViewStatus: String,

    @SerializedName("embeddable")
    var embeddable: Boolean,

    @SerializedName("publicDomain")
    var publicDomain: Boolean

)
