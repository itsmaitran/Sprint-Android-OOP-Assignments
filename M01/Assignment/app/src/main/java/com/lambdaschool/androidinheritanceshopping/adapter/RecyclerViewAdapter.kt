package com.lambdaschool.androidinheritanceshopping.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.lambdaschool.androidinheritanceshopping.R
import com.lambdaschool.androidinheritanceshopping.model.ShoppingItem
import kotlinx.android.synthetic.main.shopping_item_layout.view.*

class RecyclerViewAdapter (internal var shoppingItems: ArrayList<ShoppingItem>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var card: CardView = view.cv
        var item: TextView = view.tv_shopping_item
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.shopping_item_layout, parent, false)
        return ViewHolder(
            viewGroup
        )
    }

    override fun getItemCount(): Int {
        return shoppingItems.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.card.background = ContextCompat.getDrawable(holder.card.context, shoppingItems[position].colorId)
        holder.item.text = shoppingItems[position].getDisplayName()
    }
}