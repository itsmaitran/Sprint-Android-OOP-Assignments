package com.lambdaschool.androidinheritanceshopping.model

// Build a parent class called ShoppingItem
// Give the class at least the following attributes an int for a color id and a String for the product name
// The class's constructor should be protected
open class ShoppingItem protected constructor (val colorId: Int, val productName: String) {
    // Write a method for the class called getDisplayName which will return a string in this case, just the product name

    open fun getDisplayName(): String {
        return productName
    }
}