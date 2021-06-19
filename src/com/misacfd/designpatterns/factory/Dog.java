package com.misacfd.designpatterns.factory;

public class Dog extends AbstractAnimal implements Animal {

    @Override
    public void speak() {
        System.out.println("Woof woof");
    }
}
