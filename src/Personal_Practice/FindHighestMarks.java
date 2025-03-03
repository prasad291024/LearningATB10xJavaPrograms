package Personal_Practice;

import java.util.Scanner;

public class FindHighestMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[6]; // Array to store 6 numbers

        System.out.println("Enter marks of 6 subjects:");

        // Taking input from the user
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Find Maximum number
        int max = marks[0];
        System.out.println("\nmaximum marks scored:");
        for (int num : marks) {
            if(num > max)
                max  = num;

        }
        System.out.print(max);
        sc.close();
    }

}
