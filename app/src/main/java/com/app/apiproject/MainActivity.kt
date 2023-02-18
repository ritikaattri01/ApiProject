package com.app.apiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.apiproject.databinding.ActivityMainBinding
import com.app.apiproject.ui.adapter.PullRequestAdapter
import com.app.apiproject.ui.models.PullRequestModel

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding!!.recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<PullRequestModel>()

        data.add(PullRequestModel(R.drawable.ic_android_black_24dp, "BOOKS "))
        data.add(PullRequestModel(R.drawable.ic_android_black_24dp, "Business "))


        val adapter = PullRequestAdapter(data)
        binding!!.recyclerView.adapter = adapter
    }
}