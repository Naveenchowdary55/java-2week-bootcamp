class Calculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        
        System.out.println("well come to the calculator");
        System.out.println("Addition = " + calc.add(10, 5));
        System.out.println("Subtraction = " + calc.sub(10, 5));
        System.out.println("Multiplication = " + calc.mul(10, 5));
        System.out.println("Division = " + calc.div(10, 5));

    }
}