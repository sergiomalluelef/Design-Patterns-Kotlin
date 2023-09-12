package com.sergidev.feature.designpatterns.creational.factory_method.factories

import com.sergidev.feature.designpatterns.creational.factory_method.vehicles.Truck
import com.sergidev.feature.designpatterns.creational.factory_method.vehicles.Vehicle

// Concrete implementation of the Truck factory.
class TruckFactory : VehicleFactory {
    override fun createVehicle(): Vehicle {
        return Truck()
    }
}