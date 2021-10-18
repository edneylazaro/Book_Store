package com.example.bookstore_edneylzaro.utilities

import com.google.gson.annotations.SerializedName

data class VolumeInfo(
    @SerializedName("title")
    var title: String,

    @SerializedName("authors")
    var authors: List<String>,

    @SerializedName("publisher")
    var publisher: String,

    @SerializedName("publishedDate")
    var publishedDate: String,

    @SerializedName("description")
    var description: String,

    @SerializedName("industryIdentifiers")
    var industryIdentifiers: IndustryIdentifiers,

    @SerializedName("pageCount")
    var pageCount: Int,

    @SerializedName("dimensions")
    var dimensions: Dimensions,

    @SerializedName("printType")
    var printType: String,

    @SerializedName("categories")
    var categories: List<String>,

    @SerializedName("averageRating")
    var averageRating: Double,

    @SerializedName("ratingsCount")
    var ratingsCount: Int,

    @SerializedName("contentVersion")
    var contentVersion: String,

    @SerializedName("imageLinks")
    var imageLinks: ImageLinks,

    @SerializedName("language")
    var language: String,

    @SerializedName("mainCategory")
    var mainCategory: String,

    @SerializedName("previewLink")
    var previewLink: String,
)
