package Personal_Practice;

public class DemoFunctions {
    public static void main(String[] args) {
        // Declare and initialize the variables before using them
        int a = 10;
        String b = "Hello";

        // Call the overloaded main method correctly
        DemoFunctions.main(a, b);
    }

    // Overloaded main method
    public static void main(int x, String y) {
        System.out.println("Integer: " + x);
        System.out.println("String: " + y);
    }
}
