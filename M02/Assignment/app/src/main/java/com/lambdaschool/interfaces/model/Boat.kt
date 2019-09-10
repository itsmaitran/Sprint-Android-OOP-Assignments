package com.lambdaschool.interfaces.model

class Boat(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), WaterTravel {

    override fun sail() : String {
        return "sails"
    }

    override fun travel() : String {
        return "$id travels via ${sail()}."
    }
}