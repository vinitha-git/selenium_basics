package org.seleniumbasics;

public class EvenNumbers {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
