package org.example;

class Tiger extends WildAnimal {
    public Tiger(String name) {
        super(name, "джунглях", 1000, 30);
        Animal.totalTiger++;
    }
}
