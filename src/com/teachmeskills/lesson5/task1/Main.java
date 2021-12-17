package com.teachmeskills.lesson5.task1;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person man = new Person("Vitaly", "Zaitsev", new Date(1998, Calendar.JANUARY, 26),
                75.5, Sex.M, new Shirt(Size.S, "blue", "Hello World!"), new Pants(Size.S, "black"));

        man.go();
        man.sayAge();
        man.tellAboutShirt();
        man.tellAboutPants();

        man.changeShirt(Size.M, "black", "Earth picture");
        man.tellAboutShirt();

        man.changePants(Size.M, "blue");
        man.tellAboutPants();

        System.out.println();
        Person woman = new Person("Inna", "Yakubova", new Date(1997, Calendar.AUGUST, 15),
                58.2, Sex.F, new Shirt(Size.XS, "white", "dog picture"), new Pants(Size.XS, "blue"));

        woman.go();
        woman.sayAge();
        woman.tellAboutShirt();
        woman.tellAboutPants();

        woman.changeShirt(Size.S, "blue", "picture of nature");
        woman.tellAboutShirt();

        woman.changePants(Size.S, "black");
        woman.tellAboutPants();
    }
}
