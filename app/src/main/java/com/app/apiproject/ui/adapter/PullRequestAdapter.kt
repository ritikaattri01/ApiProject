package com.app.apiproject.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.apiproject.R
import com.app.apiproject.ui.models.PullRequestModel

class PullRequestAdapter (private val mList: List<PullRequestModel>) :
    RecyclerView.Adapter<PullRequestAdapter.ViewHolder>() {

    var onItemClick : ((PullRequestModel) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pull_request_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pullRequestModel = mList[position]
        holder.imageView.setImageResource(pullRequestModel.image)
        holder.textView.text = pullRequestModel.name

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(pullRequestModel)
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}