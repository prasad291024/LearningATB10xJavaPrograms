package ex_02_JAVA_Basics;

public class Lab_printf {

    public static void main(String[] args)
    {
    int a = 10;
        System.out.printf("Your variable name is:  %d", a); // print int

 /*     %d - int, byte, short, long
        %f - float
        %s - string
        %b - boolean

*/
        System.out.println();
        byte b = 10;
        System.out.printf("%d", b);
    }
}
