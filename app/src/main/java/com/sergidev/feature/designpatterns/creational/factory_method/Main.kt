package com.sergidev.feature.designpatterns.creational.factory_method

import com.sergidev.feature.designpatterns.creational.factory_method.factories.CarFactory
import com.sergidev.feature.designpatterns.creational.factory_method.factories.MotorcycleFactory
import com.sergidev.feature.designpatterns.creational.factory_method.factories.TruckFactory
import com.sergidev.feature.designpatterns.creational.factory_method.factories.VehicleFactory
import com.sergidev.feature.designpatterns.creational.factory_method.vehicles.Vehicle

fun main() {
    val carFactory: VehicleFactory = CarFactory()
    val car: Vehicle = carFactory.createVehicle()
    evaluateVehicle(car)

    val motorcycleFactory: VehicleFactory = MotorcycleFactory()
    val motorcycle: Vehicle = motorcycleFactory.createVehicle()
    evaluateVehicle(motorcycle)

    val truckFactory: VehicleFactory = TruckFactory()
    val truck: Vehicle = truckFactory.createVehicle()
    evaluateVehicle(truck)
}

private fun evaluateVehicle(vehicle: Vehicle) {
    vehicle.accelerate()
    vehicle.brake()
}