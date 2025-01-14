package ex_02_JAVA_Basics;

public class MultiplicationTableWithoutLoop {
    public static void main(String[] args) {
        int number = 9;

        {
            System.out.printf("Multiplication Table for %d:%n", number);
            System.out.printf("%d x %2d = %2d%n", number, 1, number * 1);
            System.out.printf("%d x %2d = %2d%n", number, 2, number * 2);
            System.out.printf("%d x %2d = %2d%n", number, 3, number * 3);
            System.out.printf("%d x %2d = %2d%n", number, 4, number * 4);
            System.out.printf("%d x %2d = %2d%n", number, 5, number * 5);
            System.out.printf("%d x %2d = %2d%n", number, 6, number * 6);
            System.out.printf("%d x %2d = %2d%n", number, 7, number * 7);
            System.out.printf("%d x %2d = %2d%n", number, 8, number * 8);
            System.out.printf("%d x %2d = %2d%n", number, 9, number * 9);
            System.out.printf("%d x %2d = %2d%n", number, 10, number * 10);
        }

    }
}

