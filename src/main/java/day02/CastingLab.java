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
         int a = 10;
        double b = a;
        System.out.println(b);

        double x = 10.9;
        int y = (int) x;
        System.out.println(y);

        System.out.println(5 / 2);
        System.out.println(5 / 2.0);

 
    }
}
