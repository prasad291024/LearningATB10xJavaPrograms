package Task9thFeb;


public class Q4_PyramidPattern {
        public static void main(String[] args) {
            int rows = 5; // Number of rows in the pyramid
            char[] stars = new char[2 * rows - 1];

            for (int i = 0; i < stars.length; i++) {
                stars[i] = ' '; // Initialize with spaces
            }

            // Print pyramid pattern
            for (int i = 0; i < rows; i++) {
                int mid = rows - 1;
                for (int j = mid - i; j <= mid + i; j++) {
                    stars[j] = '*';
                }
                System.out.println(new String(stars));
            }
        }
}


