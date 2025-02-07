package Task7thFeb;

public class PyramidPattern_WhileLoop {
    public static void main(String[] args) {
        int rows = 5;
        int i = 1;

        while (i <= rows) {
            int j = i;
            // Printing spaces
            while (j < rows) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            // Printing stars
            while (k <= (2 * i - 1)) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
