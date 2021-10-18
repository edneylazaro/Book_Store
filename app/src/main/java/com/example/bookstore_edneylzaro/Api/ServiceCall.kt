package com.example.bookstore_edneylzaro.Api

import com.example.bookstore_edneylzaro.BuildConfig
import com.example.bookstore_edneylzaro.utilities.BookModel
import com.example.bookstore_edneylzaro.utilities.BooksResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ServiceCall {

    @GET("volumes?q=mobiledevelopment")
    fun fetchBooks(@Query("key") token: String): Call<BooksResponse>

    @get: GET("volumes?q=mobiledevelopment")
    var books: Call<BooksResponse>


    companion object {
        const val BASE_URL = "https://www.googleapis.com/books/v1/"
    }

}