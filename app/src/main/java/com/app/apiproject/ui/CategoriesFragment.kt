package com.app.apiproject.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.apiproject.R
import com.app.apiproject.databinding.FragmentCategoriesBinding
import com.app.apiproject.ui.adapter.FragmentAdapter
import com.app.apiproject.ui.models.CategoriesModel

class CategoriesFragment : Fragment() {
    private lateinit var binding: FragmentCategoriesBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var fragmentadapter: FragmentAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = binding.fraRecyclerview
        recyclerView.layoutManager = GridLayoutManager(context,3)

        val data = ArrayList<CategoriesModel>()
        data.add(CategoriesModel(R.drawable.perfume4, "Fragrance"))
        data.add(CategoriesModel(R.drawable.beardo10, "Beardo"))
        data.add(CategoriesModel(R.drawable.shoes1, "Footwear"))
        data.add(CategoriesModel(R.drawable.shampoo1, "Shampoo"))
        data.add(CategoriesModel(R.drawable.caffeine1, "Caffeine"))
        data.add(CategoriesModel(R.drawable.watch1, "Watches"))
        data.add(CategoriesModel(R.drawable.s_watch9, "Smart Watches"))
        data.add(CategoriesModel(R.drawable.rayban2, "Sunglasses"))
        data.add(CategoriesModel(R.drawable.shirt1, "Top Wear"))
        data.add(CategoriesModel(R.drawable.beardo7, "Bath and Body"))

        fragmentadapter = FragmentAdapter(data)
        recyclerView.adapter = fragmentadapter

        fragmentadapter.onItemClick = {
            val intent = Intent(context, ProductListActivity::class.java)
            intent.putExtra("product_data", it)
            startActivity(intent)
        }
    }
}

