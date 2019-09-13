package com.lambdaschool.interfaces.model

class Helicopter(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), AirTravel {

    override fun fly() : String {
        return "moves patients to and from healthcare facilities and accident scenes"
    }

    override fun travel() : String {
        return "A rescue ${id.toLowerCase()} ${fly()}."
    }
}