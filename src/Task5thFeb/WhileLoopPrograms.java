package Task5thFeb;

    public class WhileLoopPrograms {
        public static void main(String[] args) {
            // 1️⃣ Print numbers from 1 to 10
            System.out.println("Numbers from 1 to 10:");
            int i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
            System.out.println("-------------------"); // New line

            // 2️⃣ Print even numbers from 1 to 20
            System.out.println("Even numbers from 1 to 20:");
            int j = 1;
            while (j <= 20) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
                j++;
            }
            System.out.println();
            System.out.println("-------------------"); // New line

            // 3️⃣ Print "Java" 5 times
            System.out.println("\"Java\" printed 5 times:");
            int count = 1;
            while (count <= 5) {
                System.out.println("Java");
                count++;
            }

            System.out.println("-------------------"); // New line

            // 4️⃣ Calculate sum of first 10 natural numbers
            int sum = 0;
            int k = 1;
            while (k <= 10) {
                sum += k;
                k++;
            }
            System.out.println("Sum of the first 10 natural numbers: " + sum);

            System.out.println("-------------------"); // New line

            // 5️⃣ Print the multiplication table of 7
            System.out.println("Multiplication table of 7:");
            int multiplier = 1;
            while (multiplier <= 10) {
                System.out.println("7 x " + multiplier + " = " + (7 * multiplier));
                multiplier++;
            }
        }
    }


