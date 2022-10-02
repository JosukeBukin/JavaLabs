package ru.mirea.lab3;

public class Pan extends Dish{
    private int radius;

    public Pan(int radius, int price) {
        this.radius = radius;
        setPrice(price);
        setName("Frying pan");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI*radius*radius);
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: "+getName()+" Price: "+getPrice()+" Size: "+getArea());
    }
}
