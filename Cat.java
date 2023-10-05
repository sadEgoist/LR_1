package org.example;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
        runLimit = 200;
        Animal.totalCat++;
    }
}
