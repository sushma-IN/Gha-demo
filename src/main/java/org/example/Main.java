package org.example;


public class Main {
    private static final int LOOP_LIMIT = 5;


    public static void main(final String[] args) {
        System.out.printf("Hello and welcome!%n");

        for (int i = 1; i <= LOOP_LIMIT; i++) {
            System.out.println("i = " + i);
        }
    }
}
