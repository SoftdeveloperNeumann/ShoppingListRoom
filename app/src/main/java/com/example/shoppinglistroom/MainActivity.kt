package com.example.shoppinglistroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoppinglistroom.databinding.ActivityMainBinding
import com.example.shoppinglistroom.viewmodel.ShoppingMemoViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}