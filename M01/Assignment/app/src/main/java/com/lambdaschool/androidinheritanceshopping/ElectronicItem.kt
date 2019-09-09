package com.lambdaschool.androidinheritanceshopping

import com.lambdaschool.androidinheritanceshopping.model.ShoppingItem

class ElectronicItem protected constructor(colorId: Int, productName: String) : ShoppingItem(colorId, productName) {

    constructor(productName: String) : this(R.color.colorElectronicItem, productName)

    override fun getDisplayName(): String {
        return "$productName:\n Store:$storeName\n Warranty:$itemWarranty"
    }
}