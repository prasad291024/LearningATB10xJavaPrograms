package Personal_Practice;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }


public static void main(String[] args) {
    Calculator c = new Calculator();
    System.out.println(c.add(2, 3));       // Outputs 5
    System.out.println(c.add(2, 3, 4));    // Outputs 9

}}