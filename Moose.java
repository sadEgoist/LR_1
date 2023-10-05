package org.example;

class Moose extends WildAnimal {
    public Moose(String name) {
        super(name, "лесу", 400, 10);
        Animal.totalMoose++;
    }
}
