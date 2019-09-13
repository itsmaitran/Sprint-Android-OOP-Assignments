package com.lambdaschool.interfaces.model

class Submarine(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), WaterTravel {

    override fun sail() : String {
        return "is a watercraft capable of independent operation underwater"
    }

    override fun travel() : String {
        return "A ${id.toLowerCase()} ${sail()}."
    }
}