package com.teachmeskills.lesson7.task1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("колбаса", "Могилев", "рыжий");
        Animal dog = new Dog("мясо", "Минск", "спаниель");
        Animal horse = new Horse("овес", "деревня", false);
        Vet vet = new Vet();

        Animal[] animals = {cat, dog, horse};

        //Животные издают звуки
        cat.makeNoise();
        dog.makeNoise();
        horse.makeNoise();
        System.out.println();

        //Животные едят
        cat.eat();
        dog.eat();
        horse.eat();
        System.out.println();

        //Животные спят
        cat.sleep();
        dog.sleep();
        horse.sleep();
        System.out.println();

        for (Animal animal : animals) {
            vet.treatAnimal(animal.food, animal.location);
        }
    }
}
