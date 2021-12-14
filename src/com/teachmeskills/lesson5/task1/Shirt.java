package com.teachmeskills.lesson5.task1;

public class Shirt {
    public Size size;
    public String color;
    public String print;

    Shirt(Size size, String color, String print) {
        this.size = size;
        this.color = color;
        this.print = print;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrint(String print) {
        this.print = print;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getPrint() {
        return print;
    }
}
