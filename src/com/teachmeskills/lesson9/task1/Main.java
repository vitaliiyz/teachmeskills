package com.teachmeskills.lesson9.task1;

import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        CompareByPrice compareByPrice = new CompareByPrice();
        CompareByAdding compareByAdding = new CompareByAdding();

        Product phone = new Product(1, "Phone", 500);
        Product laptop = new Product(121, "Macbook", 1500);
        Product tv = new Product(1011, "TV", 1000);
        Product keyboard = new Product(111222, "Keyboard", 50);
        Shop shop = new Shop();

        List<Product> productList = shop.getProductList();

        shop.addProduct(phone);
        Thread.sleep(10);
        shop.addProduct(laptop);
        Thread.sleep(10);
        shop.addProduct(tv);
        Thread.sleep(10);
        shop.addProduct(keyboard);

        //Добавить продукт, который уже присутствует в списке
        shop.addProduct(phone);

        System.out.println("\nСписок товаров в магазине:");

        productList.forEach(product -> System.out.println(product));

        //Сортировать товары по цене
        productList.sort(compareByPrice);

        System.out.println("\nСписок отсортированных товаров (по цене) в магазине:");
        productList.forEach(product -> System.out.println(product));

        //Удалить продукт
        shop.removeProduct(121);
        System.out.println("\nСписок товаров в магазине:");
        productList.forEach(product -> System.out.println(product));
        shop.removeProduct(11);
        System.out.println("\nСписок товаров в магазине:");
        productList.forEach(product -> System.out.println(product));

        //Сортировать товары по добавлению (последние добавленные в начале)
        System.out.println("\nСписок отсортированных товаров (по добавлению (последние в начале)) в магазине:");
        productList.sort(compareByAdding);
        System.out.println("\nСписок товаров в магазине:");
        productList.forEach(product -> System.out.println(product));

        //Редактировать товар
        shop.editProduct(scanner, tv);
        System.out.println("\nСписок товаров в магазине:");
        productList.forEach(product -> System.out.println(product));

    }
}
