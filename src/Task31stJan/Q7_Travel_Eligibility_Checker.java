package Task31stJan;

import java.util.Scanner;

public class Q7_Travel_Eligibility_Checker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // get input from user as Age
            System.out.print("Enter Age: ");

            // check if input is an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Age must be a number.");
                return;
            }
            int age = scanner.nextInt();

            if (age <= 0) {
                System.out.println("Invalid age! Age must be greater than zero.");
                return;
            }
            if (age < 18) {
                System.out.println("Sorry! You must be at least 18 years old to travel.");
                return;
            }
            if (age > 80) {
                System.out.println("Sorry! You exceed the maximum allowed age for travel (80 years).");
                return;
            }

            // Taking user input for Visa Status
            System.out.print("Enter Visa Status (Approved/Rejected): ");
            String visaStatus = scanner.next();

            // Converting visa status to lowercase to handle case sensitivity
            visaStatus = visaStatus.toLowerCase();

            if (!visaStatus.equals("approved") && !visaStatus.equals("rejected")) {
                System.out.println("Invalid input! Visa status must be either 'Approved' or 'Rejected'.");
                return;
            }
            if (visaStatus.equals("approved")) {
                System.out.println("Congratulations! You are eligible to travel.");
            } else {
                System.out.println("Sorry! Your visa is rejected. You cannot travel.");
            }
            scanner.close();
        }
    }


