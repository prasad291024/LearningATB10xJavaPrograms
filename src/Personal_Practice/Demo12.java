package Personal_Practice;

import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);


        int a =23, b =45;
        int max = ( a > b )? a : b;
        System.out.println(max);
    }
}