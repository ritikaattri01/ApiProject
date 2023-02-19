package com.app.apiproject.ui.activity

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.app.apiproject.R
import com.app.apiproject.databinding.ActivityDetailPageBinding
import com.app.apiproject.ui.models.PullRequestModel

class DetailPageActivity : AppCompatActivity() {
    private var binding: ActivityDetailPageBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPageBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val detail = intent.getParcelableExtra<PullRequestModel>("detail_data")
        Log.e(TAG, "onCreate:name ${detail}", )
        if (detail != null){
            val textView : TextView = findViewById(R.id.txt_detail)
            val imageView : ImageView = findViewById(R.id.img_detail)


            textView.text = detail.name
            imageView.setImageResource(detail.image)


        }
    }
}