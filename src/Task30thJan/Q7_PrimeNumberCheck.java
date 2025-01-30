package Task30thJan;
import java.util.Scanner;
public class Q7_PrimeNumberCheck {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from the user
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            boolean isPrime = true;

            // Prime numbers are greater than 1
            if (num <= 1) {
                isPrime = false;
            } else {
                // Check divisibility from 2 to num/2
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {  // If divisible, not a prime number
                        isPrime = false;
                        break;
                    }
                }
            }

            // Output the result
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }

            scanner.close();
        }
    }


