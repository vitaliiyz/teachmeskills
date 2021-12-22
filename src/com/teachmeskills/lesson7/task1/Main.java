package com.teachmeskills.lesson7.task1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("колбаса", "Могилев", "рыжий");
        Animal dog = new Dog("мясо", "Минск", "спаниель");
        Animal horse = new Horse("овес", "деревня", false);

        Animal[] animals = {cat, dog, horse};

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
