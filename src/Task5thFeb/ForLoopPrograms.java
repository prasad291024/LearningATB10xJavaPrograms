package Task5thFeb;


    public class ForLoopPrograms {
        public static void main(String[] args) {
            // 1️⃣ Print numbers from 1 to 10
            System.out.println("Numbers from 1 to 10:");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("-------------------"); // New line

            // 2️⃣ Print even numbers from 1 to 20
            System.out.println("Even numbers from 1 to 20:");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("-------------------"); // New line

            // 3️⃣ Print "Hello" 5 times
            System.out.println("\"Hello\" printed 5 times:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
            }

            System.out.println("-------------------"); // New line

            // 4️⃣ Print the sum of first 10 natural numbers
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("Sum of the first 10 natural numbers: " + sum);

            System.out.println("-------------------"); // New line

            // 5️⃣ Print the multiplication table of 5
            System.out.println("Multiplication table of 5:");
            for (int i = 1; i <= 10; i++) {
                System.out.println("5 x " + i + " = " + (5 * i));
            }
        }
    }


