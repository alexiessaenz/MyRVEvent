package com.example.myrv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Album(var name:String, var materia:String, var date:String, var thumbnail:Int)

class AlbumAdapter(var list: ArrayList<Album>):RecyclerView.Adapter<AlbumAdapter.ViewHolder>(){
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        fun bindItems(data:Album){
            val title:TextView = itemView.findViewById(R.id.name)
            val count:TextView = itemView.findViewById(R.id.materia)
            val date:TextView = itemView.findViewById(R.id.date)
            val thumbnail:ImageView = itemView.findViewById(R.id.thumbnail)

            title.text = data.name
            count.text = data.materia
            date.text = data.date

            Glide.with(itemView.context).load(data.thumbnail).into(thumbnail)

            itemView.setOnClickListener{
                Toast.makeText(itemView.context,"Album de ${data.name}",Toast.LENGTH_LONG)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.content_item,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }
}