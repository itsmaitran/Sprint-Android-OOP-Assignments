package com.lambdaschool.androidinheritanceshopping

import com.lambdaschool.androidinheritanceshopping.model.ShoppingItem

class MusicItem (productName: String, var storeName: String, var exclusiveItem: String) : ShoppingItem(colorId, productName) {

    companion object {
        private val colorId = R.color.colorMusicItem
    }

    override fun getDisplayName(): String {
        return "$productName:\n Store:$storeName\n Exclusive Item:$exclusiveItem"
    }
}