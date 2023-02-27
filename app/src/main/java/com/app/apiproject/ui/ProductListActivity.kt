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
                        "Red Tape",
                        "Solid Formal Loafers",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes2,
                        "Bata",
                        "Mens Boss-Grip Uniform Dress Shoe",
                        "2499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes3,
                        "Red Cheif",
                        "Tan Derby's Leather Formal Shoes",
                        "1999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes4,
                        "Bata",
                        "Remo Lace Up Formal Shoes for Men",
                        "999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes5,
                        "Bata",
                        "Solid Formal Loafers",
                        "2999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes6,
                        "Red Tape",
                        "Men's Black Derby Shoes",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes7,
                        "Bata",
                        "Mens Boss-Grip Uniform Dress Shoe",
                        "1799"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shoes8,
                        "Red Cheif",
                        "Tan Derby's Leather Formal Shoes",
                        "1999"
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
                        R.drawable.watch1,
                        "Matrix",
                        "Blue, Black & Silver Dial, Day & Date Functioning, Stainless Steel Strap",
                        "1,499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.watch2,
                        "Fossil",
                        "Decker Chronograph Black Dial Men's Watch-CH2573P",
                        "5,845"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.watch3,
                        "Louis Devin",
                        "WT005 Stainless Steel Chain Analog Wrist Watch for Men",
                        "2,499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.watch4,
                        "Casio",
                        "Enticer Analog Blue Dial Men's Watch-MTP-VD01D-2EVUDF (A1364)",
                        "3,695"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.watch5,
                        "Sonata",
                        "Analog Black Dial Men's Watch-NN7924NM01/NP7924NM01",
                        "1,499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.watch6,
                        "Benyar",
                        "Luxury Business Casual Party-Wear Leather Chronograph Date Display Watch for Men",
                        "3,890"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.watch7,
                        "Titan",
                        "Essentials Analog Silver Dial Men's Watch NM77082SL01W/NN77082SL01W",
                        "3,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.watch8,
                        "Titan",
                        "Men Watches Fashion Analogue Simple Style Watches",
                        "5,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.watch9,
                        "Timex",
                        "Analog White Dial Men's Watch-MTP-V300L-7AUDF (A1177)",
                        "2,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.watch10,
                        "Tommy Hilfiger",
                        "Analog Blue Dial Men's Watch-TH1791474",
                        "11,500"
                    )
                )
            }
            "Smart Watches" -> {
                productList.add(
                    ProductModel(
                        R.drawable.s_watch1,
                        "Boat",
                        "boAt Wave Call Smart Watch, Smart Talk with Advanced Dedicated Bluetooth Calling Chip, 1.69 HD Display with 550 NITS & 70% Color Gamut, 150+ Watch Faces,",
                        "1,999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch2,
                        "AmazeFit",
                        "Amazfit GTS2 Mini Smart Watch with 3.94 cm (1.55\") AMOLED Display, SpO2 Level Measurement, 14 Days' Battery Life, 70+ Sports Modes, Built-in Amazon Alexa",
                        "6,499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch3,
                        "Honor",
                        "THonor Magic Watch 2 (46mm, Charcoal Black) 14-Days Battery, SpO2, BT Calling & Music Playback, 100 Workout Modes, AMOLED Touch Screen, Personalized Watch ",
                        "7,999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch4,
                        "Titan",
                        "Titan Smart 2 Fashion Smartwatch, 1.78” AMOLED Display with Premium Metal Body, Multiple Sports Modes with 100+ Watchfaces, Complete Health Suite with Stress Monitor",
                        "5,900"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch5,
                        "Fastrack",
                        "Fastrack Reflex Play +|BT Calling|1.3” AMOLED Display Smartwatch with AOD|Premium Metallic Body|AI Voice Assistant|In-Built Games",
                        "9,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch6,
                        "Amazfit",
                        "Amazfit GTS2 Mini (New Version) Smart Watch with Always-on AMOLED Display, Alexa Built-in, SpO2, 14 Days' Battery Life, 68 Sports Modes, GPS, HR, Sleep & Stress",
                        "5,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch7,
                        "Titan",
                        "New Titan Talk Smart Watch|BT Calling|1.39\"AMOLED Display|Immersive 454x454 Resolution|Music Storage|TWS Connect|AI Voice|Multisport Modes",
                        "9,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch8,
                        "Samsung",
                        "Samsung Gear S2 Smartwatch for Most Android Phones ",
                        "7,999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch9,
                        "Fastrack",
                        "Fastrack Reflex Play +|BT Calling|1.3” AMOLED Display Smartwatch with AOD|Premium Metallic Body|AI Voice Assistant|In-Built Games|",
                        "6,995"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch10,
                        "Amazfit",
                        "Amazfit GTS2 Mini (New Version) Smart Watch with Always-on AMOLED Display, Alexa Built-in, SpO2, 14 Days' Battery Life, 68 Sports Modes, GPS, HR, Sleep & Stress",
                        "6,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch11,
                        "Cosmo",
                        "Newly Launched Pebble Cosmos Prime Bluetooth Calling Smart Watch,Largest 1.91\" Bezel-less Edge-to-Edge Display,600 Nits Brightness,Sleek Metallic Body, Wireless",
                        "8,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch12,
                        "Crossbeats",
                        "CrossBeats Newly launched Orbit Infiniti 2.0 1.43-Inch 454×454 pxl AMOLED screen Smartwatch, Calling+Connect with TWS, Always on Display, 1000+Songs Storage",
                        "4,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch13,
                        "Amazfit",
                        "Amazfit GTS 4 Mini Smart Watch, Alexa Built-in Fitness Tracker with 24H Heart Rate Blood Oxygen Monitor, 5 Satellite Positioning, 120+ Sports Modes, 5 ATM Waterproof ",
                        "5,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch14,
                        "Cosmo",
                        "Newly Launched Pebble Cosmos Prime Bluetooth Calling Smart Watch,Largest 1.91\" Bezel-less Edge-to-Edge Display,600 Nits Brightness,Sleek Metallic Body, Wireless",
                        "3,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch15,
                        "Samsung",
                        "Samsung Gear S3 Smartwatch for Most Android Phones ",
                        "9,999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.s_watch16,
                        "Titan",
                        "Titan Smart Fashion Smartwatch, 1.78” AMOLED Display with Premium Metal Body, Multiple Sports Modes with 100+ Watchfaces, Complete Health Suite with Stress Monitor",
                        "5,900"
                    )
                )
            }
            "Caffeine"-> {
                productList.add(
                    ProductModel(
                        R.drawable.caffeine2,
                        "Caffeine",
                        "MCaffeine Coffee Face Wash for a Fresh & Glowing Skin ",
                        "297"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.caffeine3,
                        "Caffeine",
                        "MCaffeine Coffee Body Stick for On the Go Hydration, Lasting",
                        "489"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.caffeine6,
                        "Caffeine",
                        "MCaffeine Exfoliating Coffee Body Scrub For Tan Removal",
                        "384"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.caffeine5,
                        "Caffeine",
                        "MCaffeine Tan Removal Coffee Clay Face Mask",
                        "489"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.caffeine6,
                        "Caffeine",
                        "MCaffeine Exfoliating Coffee Body Scrub for Tan Removal",
                        "265"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.caffeine7,
                        "Caffeine",
                        "MCaffeine Coffee Hair Spa & Hair Fall Control Kit",
                        "1,049"
                    )
                )
            }
            "Sunglasses"-> {
                productList.add(
                    ProductModel(
                        R.drawable.rayban1,
                        "V",
                        "Men Rectangular Sunglasses",
                        "9,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.rayban2,
                        "Ray-Ban",
                        "Men Aviator Sunglasses",
                        "11,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.rayban3,
                        "Ray-Ban",
                        "Men Aviator Sunglasses",
                        "8,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.rayban4,
                        "Ray-Ban",
                        "Unisex UV Protected Sunglasses",
                        "9,999"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.rayban5,
                        "Ray-Ban",
                        "Anti-Reflective Aviator Unisex Sunglasses",
                        "9,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.rayban6,
                        "Ray-Ban",
                        "Polarised Unisex Sunglasses for Men",
                        "10,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.rayban7,
                        "Ray-Ban",
                        "Men Aviator Sunglasses",
                        "9,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.rayban8,
                        "Ray-Ban",
                        "Unisex Adult Rectangular sunglasses",
                        "12,500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.rayban9,
                        "Ray-Ban",
                        "Original Wayfarer Sunglasses",
                        "9,9990"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.rayban10,
                        "Ray-Ban",
                        "Classic Gradient Aviator Sunglasses",
                        "9,500"
                    )
                )
            }
            "Top Wear"-> {
                productList.add(
                    ProductModel(
                        R.drawable.shirt1,
                        "Allen Solly",
                        "Men's Soft Stretch Cotton Short Sleeve Solid Color Slim Fit Henley T-Shirt",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shirt2,
                        "Puma",
                        "Athleisure Men's Solid Regular fit T-Shirt",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shirt3,
                        "Pepe Jeans",
                        "Men's Striped Regular fit T-Shirt",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shirt4,
                        "Allen Solly",
                        "Men's Regular fit T-Shirt",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shirt5,
                        "Adidas",
                        "Men's Soft Stretch Cotton Short Sleeve Solid Color Slim Fit Henley T-Shirt",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shirt6,
                        "Tommy Hilfiger",
                        "Men's Regular fit T-Shirt",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shirt7,
                        "Blackberrys",
                        "Athleisure Men's Solid Regular fit T-Shirt",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shirt8,
                        "Adidas",
                        "Men's Striped Regular fit T-Shirt",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shirt1,
                        "Being Human",
                        "Athleisure Men's Solid Regular fit T-Shirt",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shirt1,
                        "Tommy Hilfiger",
                        "Men's Soft Stretch Cotton Short Sleeve Solid Color Slim Fit Henley T-Shirt",
                        "500"
                    )
                )
            }
            "Bath and Body"-> {
                productList.add(
                    ProductModel(
                        R.drawable.ustra4,
                        "Ustra",
                        "Facewash",
                        "199"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo1,
                        "Beardo",
                        "De-Tan Facewash",
                        "349"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.ustra5,
                        "Ustra",
                        "Night Cream",
                        "299"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo5,
                        "Beardo",
                        "Charcoal Facewash",
                        "295"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.caffeine2,
                        "Caffeine",
                        "Expresso Facewash",
                        "360"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.beardo7,
                        "Beardo",
                        "De-Tan body wash",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.ustra3,
                        "Ustra",
                        "Facewash",
                        "249"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.ocean1,
                        "Ocean",
                        "Facewash",
                        "500"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.caffeine1,
                        "Caffeine",
                        "Face Cream",
                        "249"
                    )
                )
            }
            "Shampoo" -> {
                productList.add(
                    ProductModel(
                        R.drawable.shampoo1,
                        "Wella",
                        "Wella Professionals Invigo Balance Aqua Pure Purifying Shampoo, 250 ml",
                        "299"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo2,
                        "Suieve",
                        "For Dry and Damaged Hair | Enriched with Fibre Active",
                        "349"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo3,
                        "Matrix",
                        "Hair Growth Vitalizer Shampoo | Shampoo for Men",
                        "249"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo4,
                        "Head & Shoulders",
                        "Head & Shoulders 2-In-1 Smooth & Silky Anti Dandruff Shampoo + Conditioner ",
                        "799"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo5,
                        "Elvive",
                        "Anti-Dandruff Hair Fall Control Keratin Shampoo for Men ",
                        "199"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo6,
                        "Seda",
                        "Hair Thickening Sulphate free Shampoo",
                        "499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo7,
                        "Dove",
                        "Dove Intense Repair Shampoo 1 Litre + Conditioner 175ml, Combo ",
                        "349"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo8,
                        "Head & Shoulders",
                        "Head & Shoulders 2-In-1 Smooth & Silky Anti Dandruff Shampoo + Conditioner ",
                        "145"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo9,
                        "Wella",
                        "Invigo Balance Aqua Pure Purifying Shampoo, 250 ml",
                        "499"
                    )
                )
                productList.add(
                    ProductModel(
                        R.drawable.shampoo10,
                        "Ustra",
                        "Ustraa Anti Hair Fall Shampoo 250ml - Clinically tested to reduce hairfall",
                        "249"
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