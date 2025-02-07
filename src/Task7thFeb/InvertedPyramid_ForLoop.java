package Task7thFeb;

public class InvertedPyramid_ForLoop {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        for (int i = rows; i >= 1; i--) {
            // Printing spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
