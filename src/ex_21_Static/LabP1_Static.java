package ex_21_Static;

public class LabP1_Static {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(33);
        Student s3 = new Student(30);

        Student.count = 100;
        Student.print_count();
        Student.m1();
        System.out.println(Student.course_name);

        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}

    class Student{
        int age; // non static variable
        static int count; // static variable
        static String course_name = "ATB"; // class loader level

        public Student(int age_c)
        {
            this.age = age_c;

        }

        static void print_count()
        {
            System.out.println(count);

        }

        static void m1(){

            System.out.println("I am a static method");
        }
    }

