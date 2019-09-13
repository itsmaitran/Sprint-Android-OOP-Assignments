package com.lambdaschool.interfaces.model

class Boat(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), WaterTravel {

    override fun sail() : String {
        return "that carries cargo, goods, and materials from one port to another"
    }

    override fun travel() : String {
        return "Cargo ship is a type of ${id.toLowerCase()} ${sail()}."
    }
}