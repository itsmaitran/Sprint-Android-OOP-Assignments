package com.lambdaschool.androidinheritanceshopping.model

import com.lambdaschool.androidinheritanceshopping.R

class MusicItem (colorId: Int = R.color.colorMusicItem, productName: String, var storeName: String, var exclusiveItem: String) : ShoppingItem(
    colorId, productName) {

    override fun getDisplayName(): String {
        return "$productName\n     Store: $storeName\n     Exclusive Item: $exclusiveItem"
    }
}