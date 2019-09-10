package com.lambdaschool.interfaces.model

class Helicopter(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), AirTravel {

    override fun fly() : String {
        return "rotors"
    }

    override fun travel() : String {
        return "$id travels via ${fly()}."
    }
}