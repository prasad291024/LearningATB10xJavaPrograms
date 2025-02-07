package Task7thFeb;

public class InvertedRightAngleTriangle_ForLoop {
    public static void main(String[] args) {
        int rows = 6; // Number of rows in the pattern

        // Outer loop for rows (starts from max and decreases)
        for (int i = rows; i >= 1; i--) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print star
            }
            System.out.println(); // Move to next line
        }
    }
}
