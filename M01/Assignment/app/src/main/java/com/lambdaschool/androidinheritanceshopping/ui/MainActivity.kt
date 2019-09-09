package com.lambdaschool.androidinheritanceshopping.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.androidinheritanceshopping.ClothingItem
import com.lambdaschool.androidinheritanceshopping.ElectronicItem
import com.lambdaschool.androidinheritanceshopping.MusicItem
import com.lambdaschool.androidinheritanceshopping.R
import com.lambdaschool.androidinheritanceshopping.model.ShoppingItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Write a method in your main activity to generate test values and add them to a List
    fun ShoppingList(): ArrayList<ShoppingItem> {

        val shoppingItemList = ArrayList<ShoppingItem>()
        val clothingItem = ArrayList<ClothingItem>()
        val electronicItem = ArrayList<ElectronicItem>()
        val musicItem = ArrayList<MusicItem>()

        clothingItem.add(ClothingItem("Henley Top", "Urban Outfitters", "X-Small"))
        clothingItem.add(ClothingItem("Quilt Hoody", "Patagonia", "Small"))
        clothingItem.add(ClothingItem("Yoga Pants", "lululemon", "4"))
        clothingItem.add(ClothingItem("Wrap", "Arc'teryx", "X-Small"))
        clothingItem.add(ClothingItem("Hiking Pants", "REI", "X-Small"))

        electronicItem.add(ElectronicItem("Noice Cancelling Headphones", "Sony", 349.99))
        electronicItem.add(ElectronicItem("Acer Monitor", "Amazon", 89.99))
        electronicItem.add(ElectronicItem("Nintendo Switch", "BestBuy", 299.99))
        electronicItem.add(ElectronicItem("iPad Pro", "Apple", 999.00))
        electronicItem.add(ElectronicItem("Google Pixel 3 XL", "Google", 899.00))

        musicItem.add(MusicItem("Crosley Turntable", "Amazon", "No"))
        musicItem.add(MusicItem("Lana Del Rey: Born to Die", "Target", "No"))
        musicItem.add(MusicItem("Wicked: A New Musical", "Barnes and Noble", "Yes"))
        musicItem.add(MusicItem("Lana Del Rey: NFR", "Urban Outfitters", "Yes"))
        musicItem.add(MusicItem("Illenium: Ascend", "AstralWerks Record", "No"))

        shoppingItemList.addAll(clothingItem)
        shoppingItemList.addAll(electronicItem)
        shoppingItemList.addAll(musicItem)

        return shoppingItemList
    }
}
