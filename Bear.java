package org.example;
class Bear extends WildAnimal {
    public Bear(String name) {
        super(name, "лесу", 800, 15);
        Animal.totalBear++;
    }
}
