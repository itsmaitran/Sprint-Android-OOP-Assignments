package com.lambdaschool.androidinheritanceshopping.model

import com.lambdaschool.androidinheritanceshopping.R

class ElectronicItem (colorId: Int = R.color.colorElectronicItem, productName: String, var storeName: String, var itemPrice: Double) : ShoppingItem(
    colorId, productName) {

    override fun getDisplayName(): String {
        return "$productName\n     Store: $storeName\n     Price: $$itemPrice"
    }
}