package com.misacfd.designpatterns.factory;

public class Application {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.createAnimal(AnimalType.CAT);
        cat.speak();
        cat.eat();

        Animal dog = AnimalFactory.createAnimal(AnimalType.DOG);
        dog.speak();
        dog.eat();

        Animal human = AnimalFactory.createAnimal(AnimalType.HUMAN);
        human.speak();
        human.eat();
    }
}
