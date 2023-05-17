package com.example.practice2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class poster2_adapter (val con:Context, val list2:ArrayList<poster2>): RecyclerView.Adapter<poster2_adapter.Link> (){
    class Link(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val im_di:ImageView=itemView.findViewById(R.id.image1)
        val text_di:TextView=itemView.findViewById(R.id.title1)
        val text2_di:TextView=itemView.findViewById(R.id.title2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): poster2_adapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.poster2_item, parent,false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: poster2_adapter.Link, position: Int) {
        holder.im_di.setImageResource(list2[position].imageId)
        holder.text_di.setText(list2[position].title)
        holder.text2_di.setText(list2[position].title2)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}
