package com.lambdaschool.interfaces.model

import java.io.Serializable

abstract class Vehicle(
    open val id: String? = null,
    open val weight: Int? = null,
    open val favorite: Boolean = false

) : Serializable {

    open fun travel(): String = ""

    override fun toString(): String {
        return "Vehicle: $id\n     Weight: $weight\n     Favorite: $favorite."
    }
}