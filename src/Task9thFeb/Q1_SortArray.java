package Task9thFeb;

public class Q1_SortArray {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        // Outer loop - Runs (n-1) times to ensure the entire array is sorted
        for (int i = 0; i < numbers.length - 1; i++) {

            // Inner loop - Moves the largest element to the end
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {  // Swap if left > right
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

