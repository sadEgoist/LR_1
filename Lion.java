package org.example;

class Lion extends WildAnimal
{
    public Lion(String name)
    {
        super(name, "саванне", 600, 20);
        Animal.totalLion++;
    }
}
