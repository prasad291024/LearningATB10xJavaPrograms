package Personal_Practice;

import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();
        int row, numberOfStars;
        for (row = 1; row <= rows; row++) {
            for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
                System.out.print("*");
            }
            System.out.println(); // Go to next line
        }
    }
}
