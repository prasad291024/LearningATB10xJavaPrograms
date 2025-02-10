package ex_16_Arrays;

public class LabP5_Max_Value_Array {
    public static void main(String[] args) {

        // my method -
        int arr[] = {32, 56, 65, 22, 644, 77};

        // find maximum value
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max);

        // find minimum value
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value in the array is: " + min);
        System.out.println("------------------------------");

        // class taught
        int array[] = {25, 14, 56, 15, 36, 77, 18, 29, 49};
        // MAX, MIN

        // Logic Building
        // 1 ->  inputs - array -> int
        // output ->  int - 77
        int max_output = give_max(array);
        int min_output = give_min(array);
        System.out.println(max_output);
        System.out.println(min_output);
    }


        static int give_max ( int[] array){
            // Logic
            int max = array[0]; //25
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            return max;
        }

        static int give_min ( int[] array){
            // Logic
            int min = array[0]; //25
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            return min;

        }
}
