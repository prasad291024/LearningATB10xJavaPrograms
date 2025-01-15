package Personal_Practice;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        int marksObtained1, passingMarks1 = 40;
        char grade;

        Scanner input = new Scanner(System.in);

        System.out.println("Input marks obtained:");
        marksObtained1 = input.nextInt();

        if (marksObtained1 >= passingMarks1) {
            if (marksObtained1 >= 90) {
                grade = 'A';
            } else if (marksObtained1 >= 75) {
                grade = 'B';
            } else if (marksObtained1 >= 60) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("You passed the exam. Grade obtained: " + grade);
        } else {
            grade = 'F';
            System.out.println("You failed the exam. Grade obtained: " + grade);
        }

        input.close();
    }
}
