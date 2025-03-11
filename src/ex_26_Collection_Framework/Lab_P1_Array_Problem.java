package ex_26_Collection_Framework;

public class Lab_P1_Array_Problem  {
    public static void main(String[] args) {
        Integer[] arr  = new Integer[10];
        arr[0] = 1; //0000000
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
//        arr[10] = 11;
//        arr[11] = 12;
//        arr[12] = 13;
//        arr[13] = 14;

        System.out.println(arr.length);

        // 1. Fixed Size
        // 2. Similar Data Type
        // Doesn't grow Automatically,
        // Less elements -> wastage of memory.  100 - Size, only used 10, 90 are waste.


    }
}
