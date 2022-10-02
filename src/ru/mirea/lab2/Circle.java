package ru.mirea.lab2;

public class Circle {
    private float radius;
    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI*radius*radius);
    }
    public float getSize() {
        return (float) (2*Math.PI*radius);
    }
}
