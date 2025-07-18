package Personal_Practice;

public class Person {
    int age; // instance variable

    void setAge(int a) {
        age = a;
    }

     void showAge() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(4);
        p.showAge();
    }
}
