package ex_03_Literals;

public class Lab_Literals_P2 {
    public static void main(String[] args) {
        float pi = 3.14f;
        float pi2 = 3.14F; //both versions are acceptable

        final int a = 10; // 10 is literal, value of a is constant

        final int AGE;
        AGE = 19;
        //AGE = 29; // will not change value of final
        System.out.println(AGE);

        float x = 10.000000000000f;

        System.out.println(x);

    }
}
