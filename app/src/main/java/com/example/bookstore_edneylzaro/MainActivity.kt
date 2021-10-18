package com.example.bookstore_edneylzaro

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bookstore_edneylzaro.Api.ServiceCall
import com.example.bookstore_edneylzaro.utilities.BookAdapter
import com.example.bookstore_edneylzaro.utilities.BookModel
import com.example.bookstore_edneylzaro.utilities.BooksResponse
import com.google.gson.Gson
import org.json.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_content)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        lateinit var bookModel: ArrayList<BookModel>
        val rf = Retrofit.Builder()
            .baseUrl(ServiceCall.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()

        val api = rf.create(ServiceCall::class.java)
        val call = api.books

        call.enqueue(object : Callback<BooksResponse> {
            override fun onResponse(call: Call<BooksResponse>, response: Response<BooksResponse>) {
                val message = response.body()?.items
                bookModel = message?.toMutableList() as ArrayList<BookModel>
                recyclerView.adapter = BookAdapter(context = this@MainActivity, bookModel)
                recyclerView.smoothScrollToPosition(0)

            }

            override fun onFailure(call: Call<BooksResponse>, t: Throwable) {
                Log.d("Error", t.message!!)
                Toast.makeText(this@MainActivity, "Error Fetching Data!", Toast.LENGTH_SHORT).show()
            }
        })
    }

}


