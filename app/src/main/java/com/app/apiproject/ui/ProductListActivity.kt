package com.app.apiproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.apiproject.R
import com.app.apiproject.databinding.ActivityProductListBinding
import com.app.apiproject.ui.adapter.ProductAdapter
import com.app.apiproject.ui.models.CategoriesModel
import com.app.apiproject.ui.models.ProductModel

class ProductListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductListBinding
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val product = intent.getParcelableExtra<CategoriesModel>("product_data")

        recyclerView = binding.productListRecyclerview
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        val productList = ArrayList<ProductModel>()

        when (product?.name) {
            "Formal Footwear" -> {
                productList.add(
                    ProductModel(
                        R.drawable.shoes1,
                        "Shoes",
                        "London Wood Sage & Sea Salt Cologne Mini",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes3,
                        "Shoes",
                        "London Wood Sage & Sea Salt Cologne Mini",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes4,
                        "Shoes",
                        "London Wood Sage & Sea Salt Cologne Mini",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes5,
                        "Shoes",
                        "London Wood Sage & Sea Salt Cologne Mini",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes6,
                        "Shoes",
                        "London Wood Sage & Sea Salt Cologne Mini",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes7,
                        "Shoes",
                        "London Wood Sage & Sea Salt Cologne Mini",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes8,
                        "Shoes",
                        "London Wood Sage & Sea Salt Cologne Mini",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes9,
                        "Shoes",
                        "London Wood Sage & Sea Salt Cologne Mini",
                        "1499"
                    )
                )
            }
            "Fragrance" -> {
                productList.add(
                    ProductModel(
                        R.drawable.perfume1,
                        "Versace",
                        "London Wood Sage & Sea Salt Cologne Mini",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo2,
                        "Beardo",
                        "Whisky Smoke Perfume for Men, | EDP | Strong & Long Lasting| Spicy, Woody",
                        "999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo10,
                        "Versace",
                        "Vita Organic Ceo Man Luxury Perfume",
                        "780"
                    )
                )

                productList.add(
                    ProductModel(
                        R.drawable.perfume2,
                        "Beardo",
                        "Snake Perfume",
                        "499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.perfume3,
                        "Versace",
                        "Oud Eau De Parfum for Men",
                        "1999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.perfume4,
                        "Lili Bermuda",
                        "Forest Spice Eau De Parfum",
                        "999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.perfume5,
                        "Shalimar",
                        "Lamante Absolute Eau de Parfum For Men",
                        "799"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.perfume6,
                        "Fantoni",
                        "Snake Perfume",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.perfume7,
                        "More",
                        "Citrus,Aromatic,Spicy Premium, Long Lasting EDP Fragrance",
                        "1199"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.perfume8,
                        "Salimar",
                        "Lamante Absolute Eau de Parfum For Men",
                        "999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.perfume9,
                        "Black",
                        "Oud Eau De Parfum for Men",
                        "2999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.perfume10,
                        "Escape",
                        "Forest Spice Eau De Parfum",
                        "4999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.perfume11,
                        "Carlier",
                        "Snake Perfume",
                        "4999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.perfume12,
                        "Versace",
                        "TOud Eau De Parfum for Men",
                        "2499"
                    )
                )
            }
            "Beardo" -> {
                productList.add(
                    ProductModel(
                        R.drawable.beardo1,
                        "Beardo",
                        "DE Tan",
                        "249"
                    )
                )

                productList.add(
                    ProductModel(
                        R.drawable.beardo2,
                        "Beardo",
                        "Whisky Smoke",
                        "499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo3,
                        "Beardo",
                        "GODFATHER",
                        "499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo4,
                        "Beardo",
                        "Growth",
                        "799"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo5,
                        "Beardo",
                        "Char Coal",
                        "299"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo6,
                        "Beardo",
                        "Hair Sirum",
                        "999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo7,
                        "Beardo",
                        "Detan Body Wash",
                        "249"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo8,
                        "Beardo",
                        "Ball Sack",
                        "799"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo9,
                        "Beardo",
                        "Sun Screen",
                        "499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo10,
                        "Beardo",
                        "klack Musl",
                        "999"
                    )
                )
            }
            "Watches" -> {
                productList.add(
                    ProductModel(
                        R.drawable.shampoo1,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo2,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo3,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo4,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo5,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo6,
                        "Aticle2",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo7,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo8,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo9,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo10,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
            }
            "Smart Watches" -> {
                productList.add(
                    ProductModel(
                        R.drawable.shampoo1,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo2,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo3,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo4,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo5,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo6,
                        "Aticle2",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo7,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo8,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo9,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo10,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
            }
            "Caffeine"-> {
                productList.add(
                    ProductModel(
                        R.drawable.shampoo1,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo2,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo3,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo4,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo5,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo6,
                        "Aticle2",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo7,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo8,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo9,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo10,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
            }
            "Sunglasses"-> {
                productList.add(
                    ProductModel(
                        R.drawable.shampoo1,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo2,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo3,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo4,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo5,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo6,
                        "Aticle2",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo7,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo8,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo9,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo10,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
            }
            "Top Wear"-> {
                productList.add(
                    ProductModel(
                        R.drawable.shampoo1,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo2,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo3,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo4,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo5,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo6,
                        "Aticle2",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo7,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo8,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo9,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo10,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
            }
            "Bath and Body"-> {
                productList.add(
                    ProductModel(
                        R.drawable.shampoo1,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo2,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo3,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo4,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo5,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo6,
                        "Aticle2",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo7,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo8,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo9,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo10,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
            }
            "Casual Footwear"->{
                productList.add(
                    ProductModel(
                        R.drawable.shampoo1,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo2,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo3,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo4,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo5,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo6,
                        "Aticle2",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo7,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo8,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo9,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo10,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
            }
            "Shampoo" -> {
                productList.add(
                    ProductModel(
                        R.drawable.shampoo1,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo2,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo3,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo4,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo5,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo6,
                        "Aticle2",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo7,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo8,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo9,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo10,
                        "Shampoo",
                        "This one is too good",
                        "500"
                    )
                )
            }
            else -> {
                productList.add(
                    ProductModel(
                        R.drawable.shoes3,
                        "Aticle2",
                        "This one is too good",
                        "500"
                    )
                )
            }
        }

        val productAdapter = ProductAdapter(productList)
        recyclerView.adapter = productAdapter

    }
}