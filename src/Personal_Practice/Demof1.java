package Personal_Practice;

public class Demof1 {


    void greet() {
        System.out.println("Hello");
    }

    // no parameter no return type
    static void greet2() {
        System.out.println("Hello2");
    }

    // no parameter with return type
    static int greet3() {
        return 3;
    }

    // with parameter no return type
    static void greet4(int a) {
        System.out.println("Value of a passed is : " + a);
    }

    // with parameter with return type
    static int greet5(int a) {
        return a;
    }



    public static void main(String[] args) {
        System.out.println("main method is here");
        Demof1 df1 = new Demof1();
        df1.greet(); // non static method call using object
        greet2(); // static method call directly
        Demof1.greet2(); // static method call using class name
        System.out.println( "What is method greet3 returns: " + Demof1.greet3()); // static method call using class name
        Demof1.greet4(4); // static method call using class name
        System.out.println(Demof1.greet5(5));


    }

}