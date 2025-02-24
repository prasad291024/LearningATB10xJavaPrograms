
//Intermediate-Level Programs:
//6️⃣ Copy elements of one array into another array.
//7️⃣ Find the second largest and second smallest number in an array.
//8️⃣ Count the frequency of each element in an array.
//9️⃣ Remove duplicates from an array.
//🔟 Merge two sorted arrays into a single sorted array.
//
//Advanced-Level Programs:
//1️⃣1️⃣ Rotate an array to the right by k positions.
//1️⃣2️⃣ Find the missing number in an array of size n-1 containing numbers from 1 to n.
//1️⃣3️⃣ Find the common elements between two arrays.
//1️⃣4️⃣ Find the intersection and union of two arrays.
//1️⃣5️⃣ Find all pairs of numbers in an array that sum up to a given number.



package Personal_Practice;

public class Array_Average {
    public static void main(String[] args) {
        int []numericals = {54, 3, 7, 32, 98, 33};
        int sum = 0;
        for(int i = 0; i < numericals.length; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of elements:  " + sum);
        double average = sum / numericals.length;
        System.out.println("Average of elements:  " + average);
    }
}
