package Task20thJan;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++); // Calculation: 11 + 11 + 12 = 34
        System.out.println(a);              // Final value of a = 13

        int b = 20;
        System.out.println(--b + b++ + b--); // Calculation: 19 + 19 + 20 = 58
        System.out.println(b);               // Final value of b = 19
    }
}
