package com.misacfd.designpatterns.factory;

public class Cat extends AbstractAnimal implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow meow meow");
    }
}
