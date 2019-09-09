package com.lambdaschool.androidinheritanceshopping

// Build a parent class called ShoppingItem
// Give the class at least the following attributes an int for a color id and a String for the product name
// The class's constructor should be protected
open class ShoppingItem protected constructor (
    val colorId: Int,
    val displayName: String
)