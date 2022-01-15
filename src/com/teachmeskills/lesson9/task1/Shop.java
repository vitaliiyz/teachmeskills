package com.teachmeskills.lesson9.task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Product> productList = new ArrayList<>();

    //Добавить продукт
    public void addProduct(Product product) {
        if (productList.isEmpty()) {
            productList.add(product);
            product.setDate(new Date());
            System.out.printf("Товар %s был успешно добавлен в список.\n", product.getName());
        } else {
            for (Product product1 : productList) {
                if (product1.getId() == product.getId()) {
                    System.out.printf("Товар %s уже присутствует в списке.\n", product.getName());
                    break;
                } else {
                    productList.add(product);
                    product.setDate(new Date());
                    System.out.printf("Товар %s был успешно добавлен в список.\n", product.getName());
                    break;
                }
            }
        }
    }

    //Вернуть список всех продуктов в магазине
    public List<Product> getProductList() {
        return this.productList;
    }

    //Удалить товар из списка по айди
    public void removeProduct(int id) {
        boolean isThereProduct = false;
        for (Product product : productList) {
            if (product.getId() != id) {
                isThereProduct = false;
            } else {
                isThereProduct = true;
                productList.remove(product);
                System.out.printf("\nТовар %s был успешно удален из списка.\n", product.getName());
                break;
            }
        }
        if (isThereProduct == false) {
            System.out.printf("\nТовар с id = %s отсутствует в списке магазина!\n", id);
        }
    }

    //Редактировать товар
    public void editProduct(Scanner scanner, Product product) {
        System.out.println("Введите id товара:");
        product.setId(scanner.nextInt());
        System.out.println("Введите наименование товара:");
        product.setName(scanner.next());
        System.out.println("Введите цену товара:");
        product.setPrice(scanner.nextInt());
        System.out.println("\nТовар был успешно изменен.");
    }

}
