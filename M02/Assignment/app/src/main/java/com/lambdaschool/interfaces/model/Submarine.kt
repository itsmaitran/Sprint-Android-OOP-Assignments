package com.lambdaschool.interfaces.model

class Submarine(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), WaterTravel {

    override fun sail() : String {
        return "water"
    }

    override fun travel() : String {
        return "$id travels via ${sail()}."
    }
}