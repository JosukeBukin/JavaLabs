package ru.mirea.lab3;

public class TestDish {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(12, 30, 300);
        bowl.displayInfo();
        Pan pan = new Pan(25, 300);
        pan.displayInfo();
        pan.setPrice(250);
        pan.displayInfo();
        Plate plate = new Plate(12, 140);
        plate.displayInfo();
    }
}
