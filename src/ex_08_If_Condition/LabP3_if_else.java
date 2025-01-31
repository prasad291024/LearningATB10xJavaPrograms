package ex_08_If_Condition;

import java.util.Scanner;

public class LabP3_if_else {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if (age > 18) {
            System.out.println("Allowed to vote");
        } else {
            System.out.println("Not allowed to vote");
        }


    }
}