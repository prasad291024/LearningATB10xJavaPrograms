package Task29thJan_Basic_If_Else;

    import java.util.Scanner; // Import Scanner class

    public class VotingEligibility {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Create Scanner object

            System.out.print("Enter your age: "); // Ask user for age
            int age = scanner.nextInt(); // Read age input

            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }

            scanner.close(); // Close scanner to prevent memory leaks
        }
    }


