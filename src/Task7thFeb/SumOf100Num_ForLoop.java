package Task7thFeb;

public class SumOf100Num_ForLoop {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of 100 numbers: " + sum);
    }
}
