package Personal_Practice;

import java.util.Scanner;

public class TriangleClassifierDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        System.out.println("Enter the lengths of the three sides of the triangle: ");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if(side1 == side2 && side2 == side3)
        {
            System.out.println("Equilateral Triangle");
        } else if(side1 == side2 || side2 == side3 || side1 == side3){
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
        scanner.close();
    }
}
