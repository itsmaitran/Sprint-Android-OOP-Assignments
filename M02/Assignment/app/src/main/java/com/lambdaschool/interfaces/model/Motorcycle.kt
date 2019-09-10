package com.lambdaschool.interfaces.model

class Motorcycle(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), GroundTravel {

    override fun drive() : String {
        return "gasoline"
    }

    override fun travel() : String {
        return "$id travels via ${drive()}."
    }
}