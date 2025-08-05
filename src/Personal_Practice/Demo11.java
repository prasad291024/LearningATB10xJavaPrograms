package Personal_Practice;

public class Demo11 {
    public static void main(String[] args) {
        int x = 10;

        x += 5;  // x = 10 + 5 = 15
        System.out.println("x after += 5: " + x);

        x -= 3;  // x = 15 - 3 = 12
        System.out.println("x after -= 3: " + x);

        x *= 2;  // x = 12 * 2 = 24
        System.out.println("x after *= 2: " + x);

        x /= 4;  // x = 24 / 4 = 6
        System.out.println("x after /= 4: " + x);

        x %= 5;  // x = 6 % 5 = 1
        System.out.println("x after %= 5: " + x);
    }

}
