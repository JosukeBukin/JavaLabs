package ru.mirea.lab3;

public class Plate extends Dish {
    private int radius;

    public Plate(int radius, int price) {
        this.radius = radius;
        this.setPrice(price);
        this.setName("Plate");
    }

    @Override
    public int getArea() {
        return (int) (Math.PI*radius*radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: "+getName()+" Price: "+getPrice()+" Size: "+getArea());
    }
}
