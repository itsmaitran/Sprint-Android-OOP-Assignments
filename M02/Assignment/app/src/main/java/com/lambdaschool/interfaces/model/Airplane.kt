package com.lambdaschool.interfaces.model

class Airplane(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), AirTravel {

    override fun fly() : String {
        return "that is used to haul passengers and freight"
    }

    override fun travel() : String {
        return "Commercial airliner is a type of ${id.toLowerCase()} ${fly()}."
    }
}