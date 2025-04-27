package ex_23_Wrapper;

public class LabP3_Wrapper {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; // Boxing - int -> Interger  - JVM -> AutoBoxing
        // Autoboxing ->  a don att, be
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b.intValue());

        Integer a2 = 42;
        int v = a2; // Unboxing -
        System.out.println(v);


    }
}