package ru.mirea.lab2;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(25.5F);
        System.out.println("Radius: "+circle.getRadius());
        System.out.println("Area: "+circle.getArea());
        System.out.println("Size: "+circle.getSize());
        circle.setRadius(2);
        System.out.println("Radius: "+circle.getRadius());
        System.out.println("Area: "+circle.getArea());
        System.out.println("Size: "+circle.getSize());
    }
}
