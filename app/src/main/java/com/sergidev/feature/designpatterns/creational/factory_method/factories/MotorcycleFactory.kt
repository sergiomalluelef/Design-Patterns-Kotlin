package com.sergidev.feature.designpatterns.creational.factory_method.factories

import com.sergidev.feature.designpatterns.creational.factory_method.vehicles.Motorcycle
import com.sergidev.feature.designpatterns.creational.factory_method.vehicles.Vehicle

// Concrete implementation of the motorcycle factory.
class MotorcycleFactory : VehicleFactory {
    override fun createVehicle(): Vehicle {
        return Motorcycle()
    }
}