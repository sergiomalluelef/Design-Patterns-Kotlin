package com.sergidev.feature.designpatterns.creational.factory_method.vehicles

class Truck : Vehicle {
    override fun accelerate() {
        println("Truck accelerating")
    }

    override fun brake() {
        println("Truck braking")
    }
}