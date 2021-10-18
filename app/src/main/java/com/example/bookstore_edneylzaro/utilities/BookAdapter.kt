package com.example.bookstore_edneylzaro.utilities

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.example.bookstore_edneylzaro.DetailActivity
import com.example.bookstore_edneylzaro.R
import com.google.gson.JsonObject
import kotlin.coroutines.coroutineContext


class BookAdapter(
    var context: Context, var bookList: List<BookModel>
) : RecyclerView.Adapter<BookAdapter.MyViewHolder>() {

    var mContext = context

    var mBookList = bookList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_card, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val thumbnail = bookList[position].volumeInfo.imageLinks.thumbnail
       // val titleStr = bookList[position].volumeInfo.title

        Glide.with(context)
            .load(thumbnail)
            .centerCrop()
            .apply(
                RequestOptions()
                    .placeholder(R.mipmap.ic_launcher)
            )
            .apply(RequestOptions.overrideOf(1000, 1000))
            .into(holder.thumbnail)



        //holder.title.text = titleStr
    }

    override fun getItemCount(): Int {
        return bookList.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var thumbnail: ImageView = itemView.findViewById(R.id.thumbnail)
        var title: TextView = itemView.findViewById(R.id.title)


        /* init {
             itemView.setOnClickListener {
                 val position = bindingAdapterPosition
                 if (position != RecyclerView.NO_POSITION) {
                     val clickedDataItem = mBookList.get(position)
                     val intent = Intent(this, DetailActivity::class.java)
                     intent.putExtra("bookModel", clickedDataItem)
                     intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

                 }
             }
         }*/
    }


}