package com.lambdaschool.androidinheritanceshopping

import com.lambdaschool.androidinheritanceshopping.model.ShoppingItem

class ElectronicItem (productName: String, var storeName: String, var itemPrice: Double) : ShoppingItem(colorId, productName) {

    companion object {
        private val colorId = R.color.colorElectronicItem
    }

    override fun getDisplayName(): String {
        return "$productName:\n Store:$storeName\n Price: $$itemPrice"
    }
}