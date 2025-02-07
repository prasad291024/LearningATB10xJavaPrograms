package Task7thFeb;

public class RightAngleTriangle_WhileLoop {
    public static void main(String[] args) {
        int rows = 6;
        int i = 1;


        while (i <= rows) {
            int j = 1;

            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
