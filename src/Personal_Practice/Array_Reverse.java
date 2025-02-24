package Personal_Practice;

public class Array_Reverse {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};  // Step 1: Original array
        int i = 0, j = numbers.length - 1;  // Step 2: Two pointers

        while (i < j) {  // Step 3: Swap elements until the middle is reached
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;

            i++;  // Move left pointer forward
            j--;  // Move right pointer backward
        }

        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
