package ex_16_Arrays;

import java.util.Arrays;

public class LabP4_Arrays {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("  - - - - - -");

        // printing all elements of array
        for (int i = 0; i < marks.length ; i++) { // 0,1,2,3,4
            System.out.println(marks[i]);
        }

        // sorting elements - ascending
        Arrays.sort(marks); // 51,87,90,91,100

        // Printing sorted array
        System.out.println("Sorted Array (Ascending Order):");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("  - - - - - -");

        // Alternatively, print array using Arrays.toString()
        System.out.println("Sorted Array: " + Arrays.toString(marks));

        System.out.println("  - - - - - -");









    }
}
