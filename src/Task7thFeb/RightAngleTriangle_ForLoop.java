package Task7thFeb;

public class RightAngleTriangle_ForLoop {
    public static void main(String[] args) {
        int rows = 6;


        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print star
            }
            System.out.println(); // Move to next line
        }
    }
}
