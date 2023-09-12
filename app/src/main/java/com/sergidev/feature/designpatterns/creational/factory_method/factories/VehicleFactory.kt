package com.sergidev.feature.designpatterns.creational.factory_method.factories

import com.sergidev.feature.designpatterns.creational.factory_method.vehicles.Vehicle

// Interface for the vehicle factory.
interface VehicleFactory {
    fun createVehicle(): Vehicle
}