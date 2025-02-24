package Personal_Practice;

public class Array_SumElements {
    public static void main(String[] args) {
        int list[] = {65, 675, 214,8765, 234324, 32432543};
        int sum = 0;
        for(int i = 0; i < list.length; i ++)
        {
            sum = sum + list[i];
        }
        System.out.println("Sum of all elements in the array is: " + sum);

        System.out.println("--------------------------------");

        int list2[] = {5, 75, 24, 87, 23, 53};
        int sum2 = 0;

        for(int num : list) {  // Enhanced for-loop
            sum2 += num;  // Same as sum = sum + num;
        }

        System.out.println("Sum of all elements in the array is: " + sum);
    }


    }



