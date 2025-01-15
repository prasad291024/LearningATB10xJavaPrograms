package Personal_Practice;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int marksobtained, passingmarks;
        passingmarks = 40;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the marks obtained in exam: ");
        marksobtained = input.nextInt();

        if(marksobtained>= passingmarks)
        {
            System.out.println("Congratulations!!! You are passed in Exam");
        }
        else
        {
            System.out.println("You are failed in Exam");
        }
    }
}
