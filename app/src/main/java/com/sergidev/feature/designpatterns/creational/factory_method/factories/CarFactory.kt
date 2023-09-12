package com.sergidev.feature.designpatterns.creational.factory_method.factories

import com.sergidev.feature.designpatterns.creational.factory_method.vehicles.Car
import com.sergidev.feature.designpatterns.creational.factory_method.vehicles.Vehicle

// Concrete implementation of the car factory.
class CarFactory : VehicleFactory {
    override fun createVehicle(): Vehicle {
        return Car()
    }
}