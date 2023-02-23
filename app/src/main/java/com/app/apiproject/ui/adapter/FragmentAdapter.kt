package com.app.apiproject.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.apiproject.R
import com.app.apiproject.ui.models.CategoriesModel

class FragmentAdapter(private val categoryList : ArrayList<CategoriesModel>) :
    RecyclerView.Adapter<FragmentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_view_design,
            parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val categories = categoryList[position]
        holder.imageView.setImageResource(categories.img)
        holder.textView.text = categories.name
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.fra_imageView)
        val textView: TextView = itemView.findViewById(R.id.fra_textView)
    }

}