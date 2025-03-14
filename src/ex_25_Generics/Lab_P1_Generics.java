package ex_25_Generics;

public class Lab_P1_Generics {
    public static void main(String[] args) {
        temp_sum(56, 85);
        temp_sum("Samay", "Raina");
    }

    static Integer temp_sum(Integer a, Integer b){
        return a+b;
    }

    static String temp_sum(String a, String b){
        return a+b;
    }
}
