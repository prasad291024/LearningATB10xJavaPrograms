package Task7thFeb;

public class InvertedRightAngleTriangle_WhileLoop {
    public static void main(String[] args) {
        int rows = 6; // Number of rows
        int i = rows; // Start from max rows

        // Outer loop using while
        while (i >= 1) {
            int j = 1;
            // Inner loop for printing stars
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println(); // Move to next line
            i--; // Decrease row count
        }
    }
}
