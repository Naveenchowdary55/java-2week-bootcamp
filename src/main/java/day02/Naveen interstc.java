public class InterestCalculator {

    public static double Interest(double principal, double rate, double years) {
        return (principal * rate * years) / 100;
    }

    public static void main(String[] args) {

         double interest = Interest(100, 10, 2000
         );

        System.out.println(" Interest =" + interest);
    }
}