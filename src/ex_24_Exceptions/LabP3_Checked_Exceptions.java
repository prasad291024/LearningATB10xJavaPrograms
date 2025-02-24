package ex_24_Exceptions;

public class LabP3_Checked_Exceptions {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (Exception e) {
            //e.printStackTrace(); // This means full problem details with line no.
            //System.out.println(e.getMessage()); // / by zero
            System.out.println("Own message!");
        }
        System.out.println("2");


        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.
        //

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.


        // FileInputStream fileInputStream = new FileInputStream("C://log.txt");


        try {
            int b = 23/0;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
            System.out.println("division by zero is not possible. Arithmetic exception");
        }

    }
}
