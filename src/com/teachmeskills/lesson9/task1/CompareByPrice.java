package com.teachmeskills.lesson9.task1;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
