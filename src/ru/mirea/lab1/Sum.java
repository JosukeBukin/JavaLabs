package ru.mirea.lab1;

import java.util.AbstractList;
import java.util.Scanner;
import java.util.Vector;

public class Sum {
    public static double findSumWithFor(double[] array) {
        double sum = (double) 0;
        for(double i : array) {
            sum += i;
        }
        return sum;
    }
    public static double findSumWithWhile(double[] array) {
        double sum = (double) 0;
        int i = 0;
        while(i < array.length) {
            sum += array[i];
            i++;
        }
        return sum;
    }
    public static double findSumWithDoWhile(double[] array) {
        double sum = (double) 0;
        int i = 0;
        do {
            sum += array[i];
            i++;
        } while(i < array.length);
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Введите размер массива: ");
        size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Введите значения массива: ");
        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        System.out.println(findSumWithFor(array));
        System.out.println(findSumWithWhile(array));
        System.out.println(findSumWithDoWhile(array));
    }
}
