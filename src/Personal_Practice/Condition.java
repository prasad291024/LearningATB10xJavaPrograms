package Personal_Practice;
import java.util.Scanner;

public class Condition
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Are you learning Java? (true/false): ");
        boolean learning = scan.nextBoolean();

        if(learning)
        {
            System.out.println("Java Programmer");
        }
        else
        {
            System.out.println("What are you doing here");
        }


    }


}


