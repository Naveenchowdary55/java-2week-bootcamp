// Day 11 exercise — see src/main/java/day11/README.md
package day11;

import java.util.Scanner;

/**
 * A tiny input helper that never lets a bad keystroke crash your program. You
 * will REUSE this in the Day 14 Library project, so make it solid now.
 *
 * <p>The classic beginner bug: call {@code sc.nextInt()}, the user types
 * "banana", and your whole program dies with an {@link java.util.InputMismatchException}.
 * {@code readInt} fixes that by looping until the input actually is an int.
 */
public class SafeInput {

    /**
     * Prints {@code prompt}, then keeps reading until the user enters a valid
     * whole number, and returns it. Anything that is not an int (letters,
     * decimals, symbols) is discarded and the prompt is shown again.
     *
     * <p>Big idea: a {@code Scanner} is not magic and it is not tied to the
     * keyboard. It reads whatever source you hand it — the console, a String, a
     * file. The tests hand it a {@code new Scanner("abc\n12.5\n42\n")}; your loop
     * should skip {@code "abc"} and {@code "12.5"} and return {@code 42}.
     *
     * <p>Hint: use {@code sc.hasNextInt()} to peek. If it is true, return
     * {@code sc.nextInt()}. If it is false, call {@code sc.next()} to THROW AWAY
     * the one bad token, then loop back and prompt again. (If you forget the
     * {@code sc.next()}, the same garbage stays in the buffer and you loop
     * forever — try it on purpose once.)
     *
     * @param sc     the Scanner to read from (console, String, file — anything)
     * @param prompt the message to show before each read attempt
     * @return the first valid int the Scanner produces
     */
    public static int readInt(Scanner sc, String prompt) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
