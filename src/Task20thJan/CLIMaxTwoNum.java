package Task20thJan;

public class CLIMaxTwoNum {
    public static void main(String[] args) {
        // Convert the command-line arguments from String to integer
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Find the maximum using the ternary operator
        int max = (num1 > num2) ? num1 : num2;

        // Print the result
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}
