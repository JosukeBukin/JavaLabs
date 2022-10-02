package ru.mirea.lab3;

public class Bowl extends Plate {
    private int height;
    public Bowl(int height, int radius, int price) {
        super(radius, price);
        this.height = height;
        setName("Bowl");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // V = 2/3 * S * r = 2/3 * pi * r^3
    public int getVolume() {
        return (2/3)*getArea()*getRadius();
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: "+getName()+" Price: "+getPrice()+"Size: "+getVolume());
    }

}
