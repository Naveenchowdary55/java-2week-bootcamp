// Day 11 warm-up — NOT tested. See src/main/java/day11/README.md
package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Warm-up exploration — there is no test for this file. The whole point is to
 * make exceptions HAPPEN, then read the stack trace they print.
 *
 * <p>A stack trace is not scary noise. Read it top to bottom: the first line
 * names the exception and its message; each {@code at ...} line below is a frame
 * in the call stack. The TOP frame — with {@code StackTraceLab.java:NN} — is the
 * exact line that blew up. Learning to jump straight to that line number is one
 * of the highest-leverage skills in this whole bootcamp.
 *
 * <p>Work through the TODOs one at a time. For each: uncomment it, run the file,
 * read the printed stack trace, and write down the class of the exception AND
 * the line number it points to. Then either fix it or wrap it in try/catch so
 * the program survives to the next one.
 */
public class StackTraceLab {

    public static void main(String[] args) {

        // TODO 1 — ArithmeticException.
        // Divide an int by zero. Run it, read the stack trace, note the line number.
        //   int boom = 10 / 0;

        // TODO 2 — ArrayIndexOutOfBoundsException.
        // Make a length-3 array and read index 5.
        //   int[] nums = {1, 2, 3};
        //   System.out.println(nums[5]);

        // TODO 3 — NullPointerException.
        // Call a method on a reference that is null.
        //   String s = null;
        //   System.out.println(s.length());

        // TODO 4 — NumberFormatException.
        // Ask Integer.parseInt to parse something that is not a number.
        //   int n = Integer.parseInt("banana");

        // TODO 5 — InputMismatchException.
        // Point a Scanner at text but ask it for an int.
        //   Scanner sc = new Scanner("hello");
        //   int x = sc.nextInt();

        // TODO 6 — Now CATCH one of them instead of crashing. Wrap TODO 1 in a
        // try/catch and print e.getMessage(). Notice the program keeps running.

        // TODO 7 — Add a finally block to your try/catch above and print
        // "cleanup ran". Prove to yourself that finally runs whether or not the
        // exception happened.

        System.out.println("StackTraceLab: uncomment the TODOs one at a time.");
    }
}
