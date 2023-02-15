package com.example.shoppinglistroom.database

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface ShoppingMemoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(memo: ShoppingMemo)

    @Delete
    suspend fun delete(memo: ShoppingMemo)

    @Query(value = "SELECT * FROM shopping_list")
    fun getAllShoppingMemos(): LiveData<List<ShoppingMemo>>

    // dient nur als Beispiel für weitere Möglichkeiten
    @Query(value = "SELECT * FROM shopping_list WHERE quantity = :quantity")
    fun getMemosByQuantity(quantity: Int): LiveData<List<ShoppingMemo>>
}