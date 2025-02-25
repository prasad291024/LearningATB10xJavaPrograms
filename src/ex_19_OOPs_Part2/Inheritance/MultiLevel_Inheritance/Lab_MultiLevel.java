package ex_19_OOPs_Part2.Inheritance.MultiLevel_Inheritance;

public class Lab_MultiLevel {
    public static void main(String[] args) {
        Son siddhartha = new Son();
        siddhartha.grandFather();
        siddhartha.father();
        siddhartha.son();
        siddhartha.home();
        siddhartha.farm();
        siddhartha.BHK3();
//        siddhartha.BHK2();
//        siddhartha.BHK1();
//        siddhartha.car();
//        siddhartha.bike();
//        siddhartha.cycle();
        siddhartha.BHK3();
        siddhartha.home();
        siddhartha.farm();

        Son pramod = new Son();
        Father f = new Father();
        GrandFather gf = new GrandFather();

        pramod.home();


//        Son s1 = new GrandFather();
//        Son s1 = new Father();
        // Son amit = new Son();

        GrandFather g1 = new Son();
        GrandFather g2 = new Father();
        Father f2 = new Son();
        // Father f3 = new GrandFather();




    }
}
