package org.example;
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Dog dog1 = new Dog("Бобик");
        Tiger tiger1 = new Tiger("Рыжик");
        Bear bear1 = new Bear("Медведь");
        Moose moose1 = new Moose("Лось");
        Lion lion1 = new Lion("Лев");


        Animal[] animals = {cat1, dog1, tiger1, bear1, moose1, lion1};
        WildAnimal [] wildAnimals = {tiger1, bear1, moose1, lion1};

        ((Lion)animals[5]).habitat();
        tiger1.habitat();
        bear1.habitat();
        moose1.habitat();

        for (Animal animal : animals)
        {
            animal.run(150);
            animal.swim(10);
        }
        for (WildAnimal wildAnimal : wildAnimals)
        {
            wildAnimal.habitat();
        }

        System.out.println("Всего создано животных: " + Animal.totalAnimals);
        System.out.println("Всего диких животных: " + Animal.totalWildAnimals);
        System.out.println("Количество Котов: " + Animal.totalCat);
        System.out.println("Количество Собак: " + Animal.totalDog);
        System.out.println("Количество Тигров: " + Animal.totalTiger);
        System.out.println("Количество Лосей: " + Animal.totalMoose);
        System.out.println("Количество Медведей: " + Animal.totalBear);
        System.out.println("Количество Львов: " + Animal.totalLion);
    }
}
