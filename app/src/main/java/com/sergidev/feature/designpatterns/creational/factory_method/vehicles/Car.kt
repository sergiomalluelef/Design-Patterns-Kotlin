package com.sergidev.feature.designpatterns.creational.factory_method.vehicles

// Concrete implementation of a car.
class Car : Vehicle {
    override fun accelerate() {
        println("Car accelerating")
    }

    override fun brake() {
        println("Car braking")
    }
}