package chapter05;

public class Calculator {
    double result;

    int a;

    double add(double x, double y) {
        double result;
        result = x + y;
        return result;
    }

    double subtract(double x, double y) {
        return x - y;
    }

    double multiply(double x, double y) {
        return x * y;
    }

    double divide(double x, double y) {
        return x / y;
    }

    void postfixOperator() {
        a++;
    }

    int changeArrayValue(int[] a) {
        a[0] = 10;
        return a[0];
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.a = 1;
        calculator.postfixOperator();
        System.out.println(calculator.a);
    }
}
