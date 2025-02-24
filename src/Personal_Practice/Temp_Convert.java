package Personal_Practice;

import java.util.Scanner;

public class Temp_Convert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter temprature to convert it celsius: ");
        double temprature = scan.nextDouble();

        temprature = ((temprature - 32) * 5) / 9;

        System.out.println("temprature in celsius: " + temprature);
    }
}