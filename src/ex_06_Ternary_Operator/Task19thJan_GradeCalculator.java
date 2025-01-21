package ex_06_Ternary_Operator;

public class Task19thJan_GradeCalculator {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        System.out.println("The grade for a score of " + score + " is: " + grade);
    }
}
