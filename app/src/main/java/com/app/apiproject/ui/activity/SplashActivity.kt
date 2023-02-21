package com.app.apiproject.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.app.apiproject.MainActivity2
import com.app.apiproject.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        navigateToMainActivity()
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

    private fun navigateToMainActivity() {
        lifecycleScope.launch {
            delay(DELAY)
            val i = Intent(applicationContext, MainActivity2::class.java)
            startActivity(i)
            finish()
         }
    }

    companion object {
        const val DELAY = 1000L
    }
}