package com.realmadridinfo.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.realmadridinfo.R
import com.realmadridinfo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navController = findNavController(R.id.mainHostFragment)
        binding.bottomNavigation.setupWithNavController(navController)
    }
}