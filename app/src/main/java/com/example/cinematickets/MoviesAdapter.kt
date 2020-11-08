package com.example.cinematickets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.movie_item.view.*

class MoviesAdapter(list: ArrayList<Movie>): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {
    var list = list


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view:View = LayoutInflater.from(parent.context).inflate(R.layout.movie_item,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = list.get(position).title
        holder.image.setImageResource(list.get(position).imageSrc)
        holder.category1.text = list.get(position).category1
        holder.category2.text = list.get(position).category2
        holder.category3.text = list.get(position).category3
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var title = itemView.itemTitle
        var image = itemView.itemImage
        var category1 = itemView.category1
        var category2 = itemView.category2
        var category3 = itemView.category3
    }


}