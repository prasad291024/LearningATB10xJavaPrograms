package Personal_Practice;

import java.util.Scanner;

public class LogicBuilding {
    /* Challenge ; ✅ Grade Calculator:
Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
E: 50-59
F: 0-49

Logic building -->
Step 1 - find inputs --> score: numerical values range between 0 to 100;
                         data types used: int,
Step 2 - find outputs --> grade: A, B, C - data type: char
Step 3 - Rough logic --> if score is >= 90 then grade will be A
                         if score is >= 80 then grade will be B
                          if score is >= 70 then grade will be C
                           if score is >= 60 then grade will be D
                            if score is >= 50 then grade will be E
                             if score is <= 49 then grade will be F :: here use else
Step 4 - Write complete logic --> We are gonna use if else operators
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Score obtained in Exam: ");
        int score = scan.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
        } else if (score >= 90) {
            System.out.println("Your Grade is A");
        } else if (score >= 80) {
            System.out.println("Your Grade is B");
        } else if (score >= 70) {
            System.out.println("Your Grade is C");
        } else if (score >= 60) {
            System.out.println("Your Grade is D");
        } else if (score >= 50) {
            System.out.println("Your Grade is E");
        } else {
            System.out.println("Your Grade is F");
        }

        scan.close();
    }
}