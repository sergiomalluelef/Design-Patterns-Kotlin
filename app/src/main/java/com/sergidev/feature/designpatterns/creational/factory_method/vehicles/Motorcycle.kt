package com.sergidev.feature.designpatterns.creational.factory_method.vehicles

// Concrete implementation of a motorcycle.
class Motorcycle : Vehicle {
    override fun accelerate() {
        println("Motorcycle accelerating")
    }

    override fun brake() {
        println("Motorcycle braking")
    }
}