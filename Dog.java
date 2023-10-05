package org.example;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
        runLimit = 500;
        swimLimit = 10;
        Animal.totalDog++;
    }
}
