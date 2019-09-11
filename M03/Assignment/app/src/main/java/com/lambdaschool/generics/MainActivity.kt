package com.lambdaschool.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Task 1:
//    Steps:
//    1. Create a simple example of a mutableList that takes strings as parameters
//    2. Try adding an integer to the list and see what happens and fix any potential issues
//    Cannot add an integer to the list. If absoulte need to add an integer, the workaround would be "0.toString()"

        val plantList = mutableListOf(
            "Fiddleleaf Fig",
            "String of Pearls",
            "String of Bananas",
            "Pothos",
            "Zee Zee Plant",
            "Madagascar Dragon Tree",
            "Maidenhair Fern",
            "Snake Plant",
            "Umbrella Plant"
        )
        plantList.add("Air Plant")

// Task 2:
//    Steps:
//    1. Create a class that accepts a particular type
//    2. Define the class and the type and see what happens when you pass an object that is of type other than the given one

        class Plants<P> {

            private var plants: P? = null
            fun put(p: P) {
                plants = p
            }

            fun get(): P? {
                return plants
            }
        }

// Task 3:
//    Steps:
//    1. Create a Function that can specify the type of arguments it can accept
//    2. Check to see what happens if you pass an object that is not of this type

        fun <P> plantList(p: P): List<P> {
            val theList = mutableListOf<P>()
            theList.add(p)
            return theList
        }

// Task 4:
//    Steps:
//    1. Create a function that returns a certain type
//    2. Expose this function to another class which can then directly call this function and retrive the object returned by the function

        fun onStart() {
            super.onStart()
            val housePlantList = plantList("Snake Plant")
            val myPlantList = plantList(0)
            Toast.makeText(this, "Our house plant list contains ${housePlantList[0]}.\n " +
                    "My plant list contains ${myPlantList[0]}.", Toast.LENGTH_SHORT).show()
        }

// Task 5:
//    Steps:
//    1. Enforce Generic Constraints by creating a class and denoting the type of objects it can hold.
//    2. To finish this task 5, create a class Phone that only accepts objects of type CellularService.

        open class CellularService
        class Phone<T: CellularService>(private var service: CellularService)

// Task 6:
//    Steps:
//    1. Enforce restricted types for a class to related types of objects.
//    2. To finish task 6, after task 5, refactor class Phone so that it can accept two types of CellularService like TMobile and Verizon.

        class Verizon: CellularService()
        class TMobile: CellularService()

        val cellularService = CellularService()
        val verizon = Verizon()
        val tMobile = TMobile()

        val cellularServicePhone = Phone<CellularService>(cellularService)
        val verizonPhone = Phone<CellularService>(verizon)
        val tMobilePhone = Phone<CellularService>(tMobile)

// TODO: Task 7
//    Steps:
//    1. Create an observable that emits 3 objects of type Int
//    2. To finish this task, you will need to import rxjava, rxAndroid dependencies using gradle.

        val observable = Observable.just(0, 1, 2)

        observable.subscribe() {int ->
            println(Int)
        }

// TODO: Task 8
//    Steps:
//    1. Create an observable that emits objects of a custom data class Actor
//    2. To finish this task, create two actors Tom Cruise, Brad Pitt and return these objects using an observable.

// TODO: Task 9
//    Steps:
//    1. Create a dummy network API like the one in the guided project to return four movies with custom attributes such as year of release, title, language, imdb rating (feel free to be creative here!, you will need to create a data class for Movie to start this task)
//    2. Make a call to this NetworkAPI to fetch the movie data and then observe the response and print it to the console.
    }
}
