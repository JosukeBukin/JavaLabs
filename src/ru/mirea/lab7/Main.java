package ru.mirea.lab7;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> dummy = new LinkedList<Integer>();
        LinkedList<Integer> current = dummy;
        int carry = 0;
        for(int i = 0; i < l1.size() || i < l2.size() || carry != 0; i++) {
            int x;
            try {
                x = l1.get(i);
            } catch (Exception e) {
                x = 0;
            }
            int y;
            try {
                y = l2.get(i);
            } catch (Exception e) {
                y = 0;
            }
            int sum = carry + x + y;
            carry = sum / 10;
            current.addLast(sum % 10);
            current.set(current.size() - 1, sum % 10);
        }
        return dummy;
    }
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter size of first list: ");
        size = scanner.nextInt();
        System.out.print("Enter elements of list: ");
        for(int i = 0; i < size; i++) {
            l1.add(scanner.nextInt());
        }
        System.out.print("Enter size of second list: ");
        size = scanner.nextInt();
        System.out.print("Enter elements of list: ");
        for(int i = 0; i < size; i++) {
            l2.add(scanner.nextInt());
        }

        System.out.println("Sum: "+addTwoNumbers(l1, l2));
    }
}
