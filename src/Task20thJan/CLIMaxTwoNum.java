package Task20thJan;

public class CLIMaxTwoNum {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        // Parsing command-line arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Finding the maximum using a ternary operator
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}
