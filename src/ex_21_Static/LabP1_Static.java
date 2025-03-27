package ex_21_Static; // Package declaration

public class LabP1_Static {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student s1 = new Student(23);
        Student s2 = new Student(33);
        Student s3 = new Student(30);

        // Accessing and modifying static variable directly using class name
        Student.count = 100; // Static variable is shared among all instances

        // Calling static method using class name
        Student.print_count();
        Student.m1(); // Static method call

        // Accessing static variable
        System.out.println(Student.course_name);

        // Accessing non-static variable using instance reference
        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(s3.age);


        // calling constructor
        Student s4 = new Student(20);
        System.out.println(s4.age);
    }
}

// Class to demonstrate static and non-static members
class Student{
    int age; // Non-static variable (Instance variable, belongs to object)
    static int count; // Static variable (Shared across all instances of the class)
    static String course_name = "ATB"; // Static variable initialized at class loading

    // Constructor (Parameterized Constructor)
    public Student(int age_c)
    {
        this.age = age_c; // Assigning the passed value to instance variable
    }

    // Static method to print the value of static variable count
    static void print_count()
    {
        System.out.println(count); // Static method can access only static variables
    }

    // Another static method demonstration
    static void m1(){
        System.out.println("I am a static method");
    }
}
