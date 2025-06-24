package Personal_Practice;

import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {

        int marks2[] = new int[6];
        int marks3[] = {5, 2, 9, 3, 8};

        marks2[0] = 76;
        marks2[1] = 34;
        marks2[2] = 18;
        marks2[3] = 54;
        marks2[4] = 11;
        marks2[5] = 13;

        // Display original arrays
        System.out.println("Original marks2: " + Arrays.toString(marks2));
        System.out.println("Original marks3: " + Arrays.toString(marks3));

        // Sort both arrays
        Arrays.sort(marks2);
        Arrays.sort(marks3);

        // Display sorted arrays
        System.out.println("\nAfter sorting:");
        System.out.println("Sorted marks2: " + Arrays.toString(marks2));
        System.out.println("Sorted marks3: " + Arrays.toString(marks3));







    }
}
