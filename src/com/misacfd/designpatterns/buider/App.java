package com.misacfd.designpatterns.buider;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle.Builder()
                .setBrand("Mercedes")
                .setWheels(4)
                .setDoors(4)
                .setMaxSpeed(250)
                .build();

        vehicle.display();
    }
}
