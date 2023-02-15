package com.example.shoppinglistroom.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.shoppinglistroom.database.ShoppingMemo
import com.example.shoppinglistroom.database.ShoppingMemoDao
import com.example.shoppinglistroom.database.ShoppingMemoDatabase

class ShoppingMemoRepository(app: Application) {
    private var shoppingMemoDao:ShoppingMemoDao
    private var allShoppingMemos: LiveData<List<ShoppingMemo>>

    init {
        val db = ShoppingMemoDatabase.Factory.getInstance(app.applicationContext)
        shoppingMemoDao = db.shoppingMemoDao()
        allShoppingMemos = shoppingMemoDao.getAllShoppingMemos()
    }

    fun getAllShoppingMemos(): LiveData<List<ShoppingMemo>>{
        return allShoppingMemos
    }

    suspend fun insertOrUpdate(memo: ShoppingMemo){
        shoppingMemoDao.insertOrUpdate(memo)
    }

    suspend fun delete(memo: ShoppingMemo){
        shoppingMemoDao.delete(memo)
    }
}