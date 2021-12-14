package com.teachmeskills.lesson5.task1;

public class Pants {
    public Size size;
    public String color;

    Pants(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
