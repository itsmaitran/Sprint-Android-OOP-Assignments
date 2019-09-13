package com.lambdaschool.androidinheritanceshopping.model

import com.lambdaschool.androidinheritanceshopping.R

// Each of the classes should have a constant value for the color resource id
// In the class constructor, pass this constant up to the super constructor
// These should all contain at least one unique data member
class ClothingItem (colorId: Int = R.color.colorClothingItem, productName: String, var storeName: String, var clothingSize: String) : ShoppingItem(colorId, productName) {

    override fun getDisplayName(): String {
        return "$productName\n     Store: $storeName\n     Size: $clothingSize"
    }
}