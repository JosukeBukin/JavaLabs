package ru.mirea.lab3;

public abstract class Dish {
    private int price;
    private String name;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayInfo();
    public abstract int getArea();
}
