package Personal_Practice;

public class Array_EvenOddCount {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Initialize counters for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is even or odd
            if (arr[i] % 2 == 0) {
                // If even, increment the even counter
                evenCount++;
            } else {
                // If odd, increment the odd counter
                oddCount++;
            }
        }

        // Print the count of even numbers
        System.out.println("Even numbers count: " + evenCount);
        // Print the count of odd numbers
        System.out.println("Odd numbers count: " + oddCount);
        // Print the total count of numbers
        System.out.println("Total numbers count: " + arr.length);
         //List out the even numbers
        System.out.println("Even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Sum of even and odd numbers: " + (evenCount + oddCount));
    }
}
