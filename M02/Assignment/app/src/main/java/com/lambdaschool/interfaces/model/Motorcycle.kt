package com.lambdaschool.interfaces.model

class Motorcycle(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), GroundTravel {

    override fun drive() : String {
        return "that emphasizes on top speed, acceleration, braking, handling and grip on paved roads"
    }

    override fun travel() : String {
        return "A sport bike is a type of ${id.toLowerCase()} ${drive()}."
    }
}