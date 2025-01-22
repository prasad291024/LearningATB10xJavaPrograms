//find largest number using Ternary Operator
package Task20thJan;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        // Using nested ternary operators
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The largest number is: " + largest);
    }
}
