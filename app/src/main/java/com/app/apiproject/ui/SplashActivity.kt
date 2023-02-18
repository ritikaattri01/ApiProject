package com.app.apiproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.app.apiproject.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Log.e("lifeCycle", "onCreate: ")
    }

    override fun onStart() {
        super.onStart()
        Log.e("lifeCycle", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.e("lifeCycle", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.e("lifeCycle", "onResume: ")
    }

    override fun onStop() {
        super.onStop()
        Log.e("lifeCycle", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("lifeCycle", "onDestroy: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("lifeCycle", "onRestart: ")
    }
}