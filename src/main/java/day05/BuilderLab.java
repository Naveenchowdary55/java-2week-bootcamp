package day05;

/**
 * Day 05 warm-up — NOT tested, no grade. See day05/README.md.
 *
 * This file is your playground for feeling the difference between gluing Strings
 * with + inside a loop versus using a StringBuilder. Strings are immutable: every
 * time you write s = s + "x", Java throws the old String away and builds a brand
 * new one. Do that 10,000 times and you have quietly created 10,000 throwaway
 * Strings. A StringBuilder keeps ONE growable buffer instead.
 *
 * Run this file directly (your IDE's Run button on main, or from src/main/java:
 *   javac day05/BuilderLab.java && java day05.BuilderLab
 * ). Then write what you saw in your log.
 */
public class BuilderLab {

    public static void main(String[] args) {
        int n = 10_000;
        long startTime, endTime;

        // Timing String concatenation
        startTime = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "x";
        }
        endTime = System.nanoTime();
        System.out.println("String concatenation time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Timing StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("x");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
