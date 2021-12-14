package com.teachmeskills.lesson5.task1;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    public String name;
    public String surname;
    public Date birthdate;
    public double weight;
    public Sex sex;
    public Shirt shirt;
    public Pants pants;

    Person(String name, String surname, Date birthdate, double weight, Sex sex, Shirt shirt, Pants pants) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.weight = weight;
        this.sex = sex;
        this.shirt = shirt;
        this.pants = pants;
    }

    public void go() {
        System.out.println(name + " " + surname + " goes.");
    }

    public int calculateAge() {
        return LocalDate.now().getYear() - birthdate.getYear();
    }

    public void sayAge() {
        System.out.println("I'm " + calculateAge() + ".");
    }

    public void tellAboutShirt() {
        System.out.println("I have " + shirt.color + " shirt. It has "
                + shirt.size + " size with " + '"' + shirt.print + '"' + " print.");
    }

    public void tellAboutPants() {
        System.out.println("I have " + pants.color + " pants. It has " + pants.size + " size.");
    }

    public void changeShirt(Size size, String color, String print) {
        shirt.setSize(size);
        shirt.setColor(color);
        shirt.setPrint(print);
    }
}
