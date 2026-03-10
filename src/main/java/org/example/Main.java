package org.example;

/**
 * Entry point for the gha-demo application.
 */
public class Main {
    private static final int LOOP_LIMIT = 5;

    /**
     * Prints a welcome message and counts from 1 to LOOP_LIMIT.
     * @param args command-line arguments (unused)
     */
    public static void main(final String[] args) {
        System.out.printf("Hello and welcome!%n");

        for (int i = 1; i <= LOOP_LIMIT; i++) {
            System.out.println("i = " + i);
        }
    }
}
