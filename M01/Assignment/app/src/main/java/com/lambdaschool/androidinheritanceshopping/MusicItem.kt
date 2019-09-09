package com.lambdaschool.androidinheritanceshopping

import com.lambdaschool.androidinheritanceshopping.model.ShoppingItem

class MusicItem protected constructor(colorId: Int, productName: String) : ShoppingItem(colorId, productName) {

    constructor(productName: String) : this(R.color.colorMusicItem, productName)

    override fun getDisplayName(): String {
        return "$productName:\n Store:$storeName\n Exclusive:$exclusiveItem"
    }
}