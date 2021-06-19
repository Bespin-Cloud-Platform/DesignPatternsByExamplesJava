package com.misacfd.designpatterns.buider;

import java.util.Objects;

public class Vehicle {
    private final String brand;
    private final int wheels;
    private final int doors;
    private final int maxSpeed;

    private Vehicle(Builder builder) {
        this.brand = Objects.requireNonNull(builder.brand, "brand");
        this.wheels = Objects.requireNonNull(builder.wheels, "wheels");
        this.doors = Objects.requireNonNull(builder.doors, "doors");
        this.maxSpeed = Objects.requireNonNull(builder.maxSpeed, "maxSpeed");
    }

    public static Builder builder() {
        return new Builder();
    }

    public void display() {
        System.out.println("brand = " + getBrand());
        System.out.println("wheels = " + getWheels());
        System.out.println("doors = " + getDoors());
        System.out.println("maxSpeed = " + getMaxSpeed());
    }

    public String getBrand() {
        return brand;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static class Builder {
        private String brand;
        private Integer wheels;
        private Integer doors;
        private Integer maxSpeed;

        Builder() {
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder of(Vehicle vehicle) {
            this.brand = vehicle.brand;
            this.wheels = vehicle.wheels;
            this.doors = vehicle.doors;
            this.maxSpeed = vehicle.maxSpeed;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
