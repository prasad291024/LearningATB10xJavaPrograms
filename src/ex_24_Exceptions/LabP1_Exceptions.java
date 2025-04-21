package ex_24_Exceptions;

public class LabP1_Exceptions {
    public static void main(String[] args) {

        System.out.println("Start the program");
        String ip;         // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
        ip = args[0];
        int a = Integer.parseInt(ip);         // java.lang.NumberFormatException: For input string: "pramod"
        int b = 100/a;         // java.lang.ArithmeticException: / by zero when args -> 0

        System.out.println(b);
        System.out.println("End the program");

        // java.lang.ArithmeticException: / by zero [when we pass args as number --> 0]
        // java.lang.NumberFormatException: For input string: "pramod" [when we pass args as string. We are expecting number as input]
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds [not passing arguments]
        // java.lang.NumberFormatException: Added float value


    }
}
