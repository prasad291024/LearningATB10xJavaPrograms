package ex_04_Operators;

public class Q5_OperatorsExample {
        public static void main(String[] args) {
            // Arithmetic Operators
            int a = 10;
            int b = 5;
            System.out.println("Sum: " + (a + b));
            System.out.println("Difference: " + (a - b));

            // Relational Operators
            System.out.println("Is a > b? " + (a > b));

            // Logical Operators
            boolean result = (a > b) && (b > 0);
            System.out.println("Logical AND result: " + result);

            // Assignment Operators
            a += 5;
            System.out.println("New value of a: " + a);

            // Increment/Decrement Operators
            a++;
            System.out.println("Incremented value of a: " + a);
        }
    }

