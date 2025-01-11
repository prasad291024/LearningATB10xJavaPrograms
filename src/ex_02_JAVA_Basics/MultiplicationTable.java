package ex_02_JAVA_Basics;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 9; // The number for which the table is to be printed

        // Loop to calculate and print the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d × %d = %d%n", num, i, num * i);
        }
    }
}

