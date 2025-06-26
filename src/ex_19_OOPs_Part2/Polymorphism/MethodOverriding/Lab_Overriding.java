package ex_19_OOPs_Part2.Polymorphism.MethodOverriding;

public class Lab_Overriding {
    public static void main(String[] args) {
        Father f = new Father();
        f.home();
        f.f1();

        System.out.println("-----------------");

        Matt m = new Matt();
        m.home();
        m.f1();
        m.m1();

        System.out.println("-----------------");

        Father f1 = new Matt(); // Dynamic Dispatch -
        f1.home(); // method overriding - ridden the father method
        f1.f1();
        //f1.m1(); // not possible
    }
}
