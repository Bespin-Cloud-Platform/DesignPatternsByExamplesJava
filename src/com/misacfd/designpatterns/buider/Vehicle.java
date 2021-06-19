package com.misacfd.designpatterns.buider;

public class Vehicle {
    private final String brand;
    private final int wheels;
    private final int doors;
    private final int maxSpeed;

    private Vehicle(String brand, int wheels, int doors, int maxSpeed){
        this.brand = brand;
        this.wheels = wheels;
        this.doors = doors;
        this.maxSpeed = maxSpeed;
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

    public void display() {
        System.out.println("brand = " + getBrand());
        System.out.println("wheels = " + getWheels());
        System.out.println("doors = " + getDoors());
        System.out.println("maxSpeed = " + getMaxSpeed());
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String brand;
        private int wheels;
        private int doors;
        private int maxSpeed;

        Builder() {
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder maxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(brand, wheels, doors, maxSpeed);
        }
    }
}
