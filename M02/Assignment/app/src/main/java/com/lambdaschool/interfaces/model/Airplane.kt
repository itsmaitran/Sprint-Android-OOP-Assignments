package com.lambdaschool.interfaces.model

class Airplane(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), AirTravel {

    override fun fly() : String {
        return "wings"
    }

    override fun travel() : String {
        return "$id travels via ${fly()}."
    }
}