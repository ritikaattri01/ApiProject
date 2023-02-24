package com.app.apiproject.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.app.apiproject.MainActivity2
import com.app.apiproject.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edTxtEmail = binding.edTxtEmail
        val edTxtPass = binding.edTxtPass
        val btnLogin = binding.btnLogin

        btnLogin.setOnClickListener {
            if (edTxtEmail.text.toString().trim().isEmpty() || edTxtPass.text.toString().trim().isEmpty()) {
                Toast.makeText(applicationContext, "Enter Email", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
        }

        val txt_signup = binding.txtSignup
        txt_signup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        val txt_for_pass = binding.txtForPass
        txt_for_pass.setOnClickListener {
            val intent = Intent(this, ForPassActivity::class.java)
            startActivity(intent)
        }
    }
}