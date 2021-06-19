package com.misacfd.designpatterns.factory;

public class Human extends AbstractAnimal implements Animal {
    @Override
    public void speak() {
        System.out.println("Hello there !");
    }

    public void eat() {
        System.out.println("Mlem :)");
    }
}
