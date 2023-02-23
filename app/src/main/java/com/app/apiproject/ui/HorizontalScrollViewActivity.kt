package com.app.apiproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.apiproject.databinding.ActivityHorizontalScrollViewBinding

class HorizontalScrollViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHorizontalScrollViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalScrollViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}