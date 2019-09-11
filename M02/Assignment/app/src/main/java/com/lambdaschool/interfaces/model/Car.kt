package com.lambdaschool.interfaces.model

class Car(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), GroundTravel {

    override fun drive() : String {
        return "that requires premium gasoline"
    }

    override fun travel() : String {
        return "Mini Cooper is a type of ${id.toLowerCase()} ${drive()}."
    }

}