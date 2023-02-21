package com.app.apiproject.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.apiproject.R
import com.app.apiproject.databinding.ActivityMainBinding
import com.app.apiproject.ui.adapter.PullRequestAdapter
import com.app.apiproject.ui.models.PullRequestModel

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    private lateinit var pullRequestAdapter: PullRequestAdapter
    private lateinit var mlist: ArrayList<PullRequestModel>
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding!!.recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<PullRequestModel>()

        data.add(PullRequestModel(R.drawable.bake, "BOOKS ", "this is a book"))
        data.add(PullRequestModel(R.drawable.img, "Business ", "Google LLC is an American multinational technology company focusing on online advertising, search engine technology, cloud computing, computer software, quantum computing, e-commerce, artificial intelligence, and consumer electronics."))

        data.add(PullRequestModel(R.drawable.bake, "BOOKS ", "this is a book"))
        data.add(PullRequestModel(R.drawable.img, "Business ", "Google LLC is an American multinational technology company focusing on online advertising, search engine technology, cloud computing, computer software, quantum computing, e-commerce, artificial intelligence, and consumer electronics."))

        data.add(PullRequestModel(R.drawable.bake, "BOOKS ", "this is a book"))
        data.add(PullRequestModel(R.drawable.img, "Business ", "Google LLC is an American multinational technology company focusing on online advertising, search engine technology, cloud computing, computer software, quantum computing, e-commerce, artificial intelligence, and consumer electronics."))

        data.add(PullRequestModel(R.drawable.bake, "BOOKS ", "this is a book"))
        data.add(PullRequestModel(R.drawable.img, "Business ", "Google LLC is an American multinational technology company focusing on online advertising, search engine technology, cloud computing, computer software, quantum computing, e-commerce, artificial intelligence, and consumer electronics."))

        data.add(PullRequestModel(R.drawable.bake, "BOOKS ", "this is a book"))
        data.add(PullRequestModel(R.drawable.img, "Business ", "Google LLC is an American multinational technology company focusing on online advertising, search engine technology, cloud computing, computer software, quantum computing, e-commerce, artificial intelligence, and consumer electronics."))

        data.add(PullRequestModel(R.drawable.bake, "BOOKS ", "this is a book"))
        data.add(PullRequestModel(R.drawable.img, "Business ", "Google LLC is an American multinational technology company focusing on online advertising, search engine technology, cloud computing, computer software, quantum computing, e-commerce, artificial intelligence, and consumer electronics."))

        data.add(PullRequestModel(R.drawable.bake, "BOOKS ", "this is a book"))
        data.add(PullRequestModel(R.drawable.img, "Business ", "Google LLC is an American multinational technology company focusing on online advertising, search engine technology, cloud computing, computer software, quantum computing, e-commerce, artificial intelligence, and consumer electronics."))



        pullRequestAdapter = PullRequestAdapter(data)
        binding!!.recyclerView.adapter = pullRequestAdapter

        pullRequestAdapter.onItemClick = {
            val intent = Intent(this, DetailPageActivity::class.java)
            intent.putExtra("detail_data", it)
            startActivity(intent)
        }

    }
}