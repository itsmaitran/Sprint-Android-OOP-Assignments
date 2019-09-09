package com.lambdaschool.androidinheritanceshopping

import com.lambdaschool.androidinheritanceshopping.model.ShoppingItem

// Each of the classes should have a constant value for the color resource id
// In the class constructor, pass this constant up to the super constructor
// These should all contain at least one unique data member
class ClothingItem (productName: String, var storeName: String, var clothingSize: String) : ShoppingItem(colorId, productName) {

    companion object {
        private val colorId = R.color.colorClothingItem
    }

    override fun getDisplayName(): String {
        return "$productName:\n Store:$storeName\n Size:$clothingSize"
    }
}