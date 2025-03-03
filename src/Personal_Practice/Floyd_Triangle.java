package Personal_Practice;

import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to generate rows:  ");
        int row = scan.nextInt();

        int number = 1;
        for(int i = 1; i <=row; i++){
            for(int j=1; j<=i; j++)
            {
                System.out.print(number + " ");
                number++;

            }
            System.out.println();
        }

    }


}
