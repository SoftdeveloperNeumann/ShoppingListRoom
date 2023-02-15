package com.example.shoppinglistroom.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglistroom.database.ShoppingMemo

class ShoppingMemoListAdapter: RecyclerView.Adapter<ShoppingMemoListAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)

    private var shoppingMemos: List<ShoppingMemo> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            android.R.layout.simple_list_item_multiple_choice,
            parent,
            false
        )
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val currentShoppingMemo = shoppingMemos[position]
        val textView = holder.itemView as TextView
        textView.text = currentShoppingMemo.toString()
    }

    override fun getItemCount(): Int {
        return shoppingMemos.size
    }

    fun setShoppingMemos(memos: List<ShoppingMemo>){
        shoppingMemos = memos
        notifyDataSetChanged()
    }
}
