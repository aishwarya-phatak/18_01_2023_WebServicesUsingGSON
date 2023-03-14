package com.example.a18_01_2023_webservicesdemo2_gson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a18_01_2023_webservicesdemo2_gson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetUsers.setOnClickListener {
            WebThread().execute(null)
        }
    }
}