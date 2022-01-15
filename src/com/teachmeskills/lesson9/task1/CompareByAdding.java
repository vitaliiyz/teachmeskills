package com.teachmeskills.lesson9.task1;

import java.util.Comparator;

public class CompareByAdding implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o2.getDate().getTime() > o1.getDate().getTime()) {
            return 1;
        } else if (o2.getDate().getTime() < o1.getDate().getTime()) {
            return -1;
        } else {
            return 0;
        }
    }
}
