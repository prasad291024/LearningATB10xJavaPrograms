package ex_25_Generics;

public class Lab_P2_Generics {
    public static void main(String[] args) {
        temp(56, 85);
        temp("Samay", "Raina");
        temp("Samay", 420);
        temp(true, false);

    }
    // T -> can be any data type

    public static <T> T temp(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}