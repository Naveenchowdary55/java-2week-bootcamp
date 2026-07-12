package day02;

/**
 * Day 02 exploration lab (NOT tested). See day02/README.md.
 *
 * Run this file, predict each answer BEFORE you look, then compare.
 * From src/main/java:   javac day02/CastingLab.java && java day02.CastingLab
 *
 * There is nothing to submit here — it is a playground for how types behave.
 */
public class CastingLab {

    public static void main(String[] args) {
        // TODO 1: Print the min and max of each primitive. Predict which are huge.
        //   System.out.println(Integer.MAX_VALUE);
        //   System.out.println(Integer.MIN_VALUE);
        //   Also try: Long.MAX_VALUE, Byte.MAX_VALUE, Short.MAX_VALUE, Double.MAX_VALUE

        // TODO 2: Overflow an int on purpose.
        //   int big = Integer.MAX_VALUE;
        //   Predict: what does (big + 1) print? Then print it. (Surprise!)

        // TODO 3: Cast a double to an int. Predict: does it round or chop?
        //   double d = 9.99;
        //   int i = (int) d;
        //   System.out.println(i);

        // TODO 4: Cast an int larger than 127 to a byte. Predict the output first.
        //   int value = 200;
        //   byte b = (byte) value;
        //   System.out.println(b);   // not 200 — why? a byte only holds -128..127

        // TODO 5: Try integer division vs double division.
        //   System.out.println(7 / 2);       // predict
        //   System.out.println(7.0 / 2);     // predict
    }
}
