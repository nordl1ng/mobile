package com.example.practice7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.practice7.model.data_movie

class adapterv(val con: Context, val data: List<data_movie>): RecyclerView.Adapter<adapterv.Link> (){
    class Link(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val im_di: ImageView =itemView.findViewById(R.id.image1)
        val text_di: TextView =itemView.findViewById(R.id.title1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterv.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.poster_item, parent,false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
    Glide.with(con).load(data[position].image).into(holder.im_di)
        holder.text_di.setText((data[position].title))

    }
    override fun getItemCount(): Int {
        return data.size
    }
}