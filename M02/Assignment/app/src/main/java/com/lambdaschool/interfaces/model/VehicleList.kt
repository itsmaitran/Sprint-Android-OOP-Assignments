package com.lambdaschool.interfaces.model

object VehicleList {

    fun generateVehicles() {
        vehicles.forEach {
            ArrayList<Vehicle>().add(it)
        }
    }

    val vehicles: ArrayList<Vehicle> = arrayListOf(
        Airplane(
            "Airplane",
            300000,
            true
        ),
        Boat(
            "Boat",
            3300,
        false
        ),
        Car(
            "Car",
            2600,
            true
        ),
        Helicopter(
            "Helicopter",
            10000,
            false
        ),
        Motorcycle(
            "Motorcycle",
            900,
            true
        ),
        Submarine(
            "Submarine",
            13800000,
            false
        )
    )
}