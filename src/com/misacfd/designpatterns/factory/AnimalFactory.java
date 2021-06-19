package com.misacfd.designpatterns.factory;

public class AnimalFactory {

    public static Animal createAnimal(AnimalType type) {
        switch (type) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case HUMAN:
                return new Human();
        }
        return null;
    }
}
