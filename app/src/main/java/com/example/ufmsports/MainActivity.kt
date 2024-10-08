package com.example.ufmsports

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.ufmsports.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())
    }

    fun replaceFragment(fragment: Fragment){
        val fragmentManager  = supportFragmentManager
        val transmission = fragmentManager.beginTransaction()
        transmission.replace(R.id.frameLayout,fragment)
        transmission.commit()
    }
}