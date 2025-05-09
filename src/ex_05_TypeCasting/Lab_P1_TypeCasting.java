package ex_05_TypeCasting;

public class Lab_P1_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
//        int a = b; // Valid - > Implicit Casting- Automatically
        int a = (int)b; // Valid - > Explicit Casting- Manually



        short s = 15;
        long l = s; // Valid - > Implicit Widening- Automatically
        long l1 = (long)s; // Valid - > Explicit Widening- Manually

        float f1 = 10.5f;
        double d = f1; // Valid - > Implicit Widening- Automatically
        double d1 = (double)f1; // Valid - > Explicit Widening- Manually

        double d2 = 10.5;
        int i = 20;
        float f = i; // Valid - > Implicit Casting- Automatically

        char ch = 'A';

    }
}
