package ex_02_JAVA_Basics;

public class Lab_LocalVariable
{
    int a = 87; // global variable
   static int b = 45; // static variable

    public static void main(String[] args) {
         int c = 10; // local variable

        Lab_LocalVariable l = new Lab_LocalVariable();

        System.out.println("print local variable: " + c);
        System.out.println("print global variable: " +l.a);
        System.out.println("print static variable: " +b);


    }
}
