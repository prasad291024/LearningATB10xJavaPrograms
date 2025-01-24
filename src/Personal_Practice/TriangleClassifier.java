package Personal_Practice;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for the three sides
        System.out.println("Enter the length of side 1: ");
        int side1 = scanner.nextInt();
        System.out.println("Enter the length of side 2: ");
        int side2 = scanner.nextInt();
        System.out.println("Enter the length of side 3: ");
        int side3 = scanner.nextInt();

        // Step 2: Check and classify the triangle
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }
    }
}
