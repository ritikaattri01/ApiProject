package com.app.apiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.fragment.app.Fragment
import com.app.apiproject.databinding.ActivityMain2Binding
import com.app.apiproject.databinding.ActivityMainBinding
import com.app.apiproject.ui.CategoriesFragment
import com.app.apiproject.ui.HomeFragment
import com.app.apiproject.ui.MoreFragment
import com.app.apiproject.ui.ProfileFragment

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding :ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.navbar.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.profile -> replaceFragment(ProfileFragment())
                R.id.more -> replaceFragment(MoreFragment())
                R.id.categories -> replaceFragment(CategoriesFragment())
                else -> {
                }
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment){

        val fragmentManger = supportFragmentManager
        val framentTransaction = fragmentManger.beginTransaction()
        framentTransaction.replace(R.id.container, fragment)
        framentTransaction.commit()
    }
}