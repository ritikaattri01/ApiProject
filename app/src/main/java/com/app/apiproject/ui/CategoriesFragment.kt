package com.app.apiproject.ui

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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        recyclerView = binding.fraRecyclerview
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.layoutManager = GridLayoutManager(context,3)

        val data = ArrayList<CategoriesModel>()
        data.add(CategoriesModel(R.drawable.perfume4, "Fragrance"))
        data.add(CategoriesModel(R.drawable.beardo10, "Beardo"))
        data.add(CategoriesModel(R.drawable.beardo7, "Bath and Body"))
        data.add(CategoriesModel(R.drawable.shampoo1, "Shampoo"))
        data.add(CategoriesModel(R.drawable.caffeine1, "Caffeine"))
        data.add(CategoriesModel(R.drawable.watch1, "Watches"))
        data.add(CategoriesModel(R.drawable.s_watch9, "Smart Watches"))
        data.add(CategoriesModel(R.drawable.rayban2, "Sunglasses"))
        data.add(CategoriesModel(R.drawable.shirt1, "Top Wear"))
        data.add(CategoriesModel(R.drawable.shoes1, "Formal Footwear"))
        data.add(CategoriesModel(R.drawable.shoes9, "Casual Footwear"))



        val adapter = FragmentAdapter(data)
        recyclerView.adapter = adapter
    }

}