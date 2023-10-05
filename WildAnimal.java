package org.example;

public class WildAnimal extends Animal
{
    String habitat;

    public WildAnimal(String name, String habitat, int runLimit, int swimLimit) {
        super(name);
        this.habitat = habitat;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        Animal.totalWildAnimals++;
    }

    public void habitat()
    {
        System.out.println(name + " обитает в " + habitat);
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
