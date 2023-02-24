package com.app.apiproject.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.apiproject.R
import com.app.apiproject.ui.models.ProductModel

class ProductAdapter(private val productList : ArrayList<ProductModel>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_card_design,
            parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productList[position]
        holder.imageView.setImageResource(product.img)
        holder.textname.text = product.name
        holder.textdesc.text = product.desc
        holder.textprice.text = product.price
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.product_img)
        val textname: TextView = itemView.findViewById(R.id.product_name)
        val textdesc: TextView = itemView.findViewById(R.id.product_desc)
        val textprice: TextView = itemView.findViewById(R.id.product_price)
    }
}