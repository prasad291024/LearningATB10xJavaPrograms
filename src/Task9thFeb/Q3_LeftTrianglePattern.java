package Task9thFeb;

 public class Q3_LeftTrianglePattern {
        public static void main(String[] args) {
            int rows = 5; // Number of rows in the pattern
            char[] stars = new char[rows];

            for (int i = 0; i < rows; i++) {
                stars[i] = '*'; // Fill the array with '*'
            }

            // Print the left triangle pattern
            for (int i = rows; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(stars[j]);
                }
                System.out.println();
            }
        }
    }


