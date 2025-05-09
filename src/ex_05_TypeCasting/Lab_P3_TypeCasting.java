package ex_05_TypeCasting;

public class Lab_P3_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;

        System.out.println(phone_no);
        //short s = phone_no; // implicit - not possible
        short s = (short) phone_no; // Explicit - possible

        System.out.println("phone no after explicit narrowing: " + s); // data loss
    }
}
