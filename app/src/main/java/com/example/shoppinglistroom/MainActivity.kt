package com.example.shoppinglistroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglistroom.adapter.ShoppingMemoListAdapter
import com.example.shoppinglistroom.databinding.ActivityMainBinding
import com.example.shoppinglistroom.viewmodel.ShoppingMemoViewModel

class MainActivity : AppCompatActivity() {

    private val adapter: ShoppingMemoListAdapter = ShoppingMemoListAdapter()
    private lateinit var binding: ActivityMainBinding
    private lateinit var shoppingMemoViewModel: ShoppingMemoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvShoppingMemos.layoutManager = LinearLayoutManager(this)
        binding.rvShoppingMemos.adapter = adapter


    }
}