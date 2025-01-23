//Another Method
package Personal_Practice;
import java.util.Scanner;

public class Palindrome2 {
    
    public static void main(String[] args) {
        String inputString;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string");
        inputString = in.nextLine();
        int length = inputString.length();
        int i, begin, end, middle = 0;
        begin = 0;
        end = length - 1;

        for (i = begin; i <= middle; i++) {
            if (inputString.charAt(begin) == inputString.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }

        if (begin > end) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}