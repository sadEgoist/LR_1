package org.example;

public class Animal {
    static int totalAnimals, totalCat, totalDog, totalTiger, totalMoose, totalLion, totalBear, totalWildAnimals = 0;
    String name;
    int runLimit;
    int swimLimit;

    public Animal(String name) {
        this.name = name;
        Animal.totalAnimals++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать такую дистанцию");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не может проплыть такую дистанцию");
        }

    }
}
