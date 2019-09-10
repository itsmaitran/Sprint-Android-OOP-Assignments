package com.lambdaschool.androidinheritanceshopping.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lambdaschool.androidinheritanceshopping.model.ClothingItem
import com.lambdaschool.androidinheritanceshopping.model.ElectronicItem
import com.lambdaschool.androidinheritanceshopping.model.MusicItem
import com.lambdaschool.androidinheritanceshopping.R
import com.lambdaschool.androidinheritanceshopping.adapter.RecyclerViewAdapter
import com.lambdaschool.androidinheritanceshopping.model.ShoppingItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_list.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
            adapter = RecyclerViewAdapter(
                shoppingItems = ArrayList(ShoppingList())
            )
        }
    }

    // Write a method in your main activity to generate test values and add them to a List
    fun ShoppingList(): ArrayList<ShoppingItem> {

        val shoppingItemList = ArrayList<ShoppingItem>()
        val clothingItem = ArrayList<ClothingItem>()
        val electronicItem = ArrayList<ElectronicItem>()
        val musicItem = ArrayList<MusicItem>()

        clothingItem.add(
            ClothingItem(
                R.color.colorClothingItem,
                "Henley Top",
                "Urban Outfitters",
                "X-Small"
            )
        )
        clothingItem.add(
            ClothingItem(
                R.color.colorClothingItem,
                "Quilt Hoody",
                "Patagonia",
                "Small"
            )
        )
        clothingItem.add(
            ClothingItem(
                R.color.colorClothingItem,
                "Yoga Pants",
                "lululemon",
                "4"
            )
        )
        clothingItem.add(
            ClothingItem(
                R.color.colorClothingItem,
                "Wrap",
                "Arc'teryx",
                "X-Small"
            )
        )
        clothingItem.add(
            ClothingItem(
                R.color.colorClothingItem,
                "Hiking Pants",
                "REI",
                "X-Small"
            )
        )

        electronicItem.add(
            ElectronicItem(
                R.color.colorElectronicItem,
                "Noice Cancelling Headphones",
                "Sony",
                349.99
            )
        )
        electronicItem.add(
            ElectronicItem(
                R.color.colorElectronicItem,
                "Acer Monitor",
                "Amazon",
                89.99
            )
        )
        electronicItem.add(
            ElectronicItem(
                R.color.colorElectronicItem,
                "Nintendo Switch",
                "BestBuy",
                299.99
            )
        )
        electronicItem.add(
            ElectronicItem(
                R.color.colorElectronicItem,
                "iPad Pro",
                "Apple",
                999.00
            )
        )
        electronicItem.add(
            ElectronicItem(
                R.color.colorElectronicItem,
                "Google Pixel 3 XL",
                "Google",
                899.00
            )
        )

        musicItem.add(
            MusicItem(
                R.color.colorMusicItem,
                "Crosley Turntable",
                "Amazon",
                "No"
            )
        )
        musicItem.add(
            MusicItem(
                R.color.colorMusicItem,
                "Lana Del Rey: Born to Die",
                "Target",
                "No"
            )
        )
        musicItem.add(
            MusicItem(
                R.color.colorMusicItem,
                "Wicked: A New Musical",
                "Barnes and Noble",
                "Yes"
            )
        )
        musicItem.add(
            MusicItem(
                R.color.colorMusicItem,
                "Lana Del Rey: NFR",
                "Urban Outfitters",
                "Yes"
            )
        )
        musicItem.add(
            MusicItem(
                R.color.colorMusicItem,
                "Illenium: Ascend",
                "AstralWerks Record",
                "No"
            )
        )

        shoppingItemList.addAll(clothingItem)
        shoppingItemList.addAll(electronicItem)
        shoppingItemList.addAll(musicItem)

        return shoppingItemList
    }
}
