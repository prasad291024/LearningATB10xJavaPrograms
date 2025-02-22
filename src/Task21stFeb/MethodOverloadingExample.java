package Task21stFeb;

class Calculator {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters (overloading)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with different parameter type (overloading)
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));       // Calls method with two int parameters
        System.out.println(calc.add(5, 10, 15));   // Calls method with three int parameters
        System.out.println(calc.add(2.5, 3.5));    // Calls method with double parameters
    }
}

