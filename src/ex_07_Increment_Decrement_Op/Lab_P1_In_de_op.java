package ex_07_Increment_Decrement_Op;

public class Lab_P1_In_de_op {
    public static void main(String[] args) {
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        String canIGoGoa = age > 24? "Yes" : "No";
        System.out.println(canIGoGoa);
    }
}
