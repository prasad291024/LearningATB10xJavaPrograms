package Task9thFeb;

import java.util.Arrays;

public class Q2_SecondSmall {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 77, 18, 29, 49};

        Arrays.sort(array);
         // 14,15,18,25,29,36,49,56,77

        int secondMin = array[1];

        System.out.println("Second smallest element in the array is: " + secondMin);
    }
}
