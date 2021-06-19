package com.misacfd.designpatterns.buider;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle.Builder()
                .brand("Mercedes")
                .doors(4)
                .maxSpeed(250)
                .build();

        vehicle.display();
    }
}
