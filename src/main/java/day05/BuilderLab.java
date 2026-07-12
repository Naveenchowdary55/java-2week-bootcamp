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
        // TODO 1: Concatenate with + in a loop.
        //   - Make a String variable, e.g. String slow = "";
        //   - Record the start time: long start = System.currentTimeMillis();
        //   - Loop 10,000 times and do slow = slow + "x"; each pass.
        //   - Record the end time and print (end - start) as "plus loop took ... ms".

        // TODO 2: Do the same work with a StringBuilder.
        //   - StringBuilder fast = new StringBuilder();
        //   - Time a loop of 10,000 that calls fast.append("x");
        //   - Turn it into a String at the end with fast.toString().
        //   - Print how many milliseconds that took.

        // TODO 3: Print both lengths to prove they built the same size of text.
        //   (Both should be 10000 characters long.)

        // TODO 4: In your log, write down the two timings and one sentence
        //   explaining WHY the + loop is slower. Try bumping 10,000 up to
        //   100,000 and watch the gap grow.

        System.out.println("Fill in the TODOs above, then read your timings.");
    }
}
