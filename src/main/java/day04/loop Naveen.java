
public class LoopBasics {

    
    public static int sumOfEvens(int n) {

        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of even numbers up to 10: " + sumOfEvens(10));

        System.out.println();
        int n = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
