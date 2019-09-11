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

    var vehicles_map: MutableMap<String, Vehicle> = HashMap()

    init {
        vehicles_map.put(vehicles[0].id, vehicles[0])
        vehicles_map.put(vehicles[1].id, vehicles[1])
        vehicles_map.put(vehicles[2].id, vehicles[2])
        vehicles_map.put(vehicles[3].id, vehicles[3])
        vehicles_map.put(vehicles[4].id, vehicles[4])
        vehicles_map.put(vehicles[5].id, vehicles[5])
    }
}