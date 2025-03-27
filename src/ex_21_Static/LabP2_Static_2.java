package ex_21_Static;

public class LabP2_Static_2 {
}

class ATB{
    static String course_name = "ATB";
    int age;
    int phone_no;
    String name;

    public ATB(int age, int phone_no, String name) {
        this.age = age;
        this.phone_no = phone_no;
        this.name = name;
    }

    void display(){
        System.out.println("Name: " + this.name + "Phone Number: " + this.phone_no + "Age: " + this.age);
    }
    static void m1(){
        System.out.println("Mark Attedance");
    }





}
