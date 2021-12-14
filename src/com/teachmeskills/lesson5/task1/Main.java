package com.teachmeskills.lesson5.task1;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person men = new Person("Vitaly", "Zaitsev", new Date(1998, Calendar.JANUARY, 26),
                75.5, Sex.M, new Shirt(Size.S, "blue", "Hello World!"), new Pants(Size.S, "black"));

        men.go();
        men.sayAge();
        men.tellAboutShirt();
        men.tellAboutPants();

        men.changeShirt(Size.M, "black", "Earth picture");
        men.tellAboutShirt();

        men.changePants(Size.M, "blue");
        men.tellAboutPants();

        System.out.println();
        Person women = new Person("Inna", "Yakubova", new Date(1997, Calendar.AUGUST, 15),
                58.2, Sex.F, new Shirt(Size.XS, "white", "dog picture"), new Pants(Size.XS, "blue"));

        women.go();
        women.sayAge();
        women.tellAboutShirt();
        women.tellAboutPants();

        women.changeShirt(Size.S, "blue", "picture of nature");
        women.tellAboutShirt();

        women.changePants(Size.S, "black");
        women.tellAboutPants();
    }
}
