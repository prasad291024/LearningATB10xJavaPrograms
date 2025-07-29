package Personal_Practice;

public class Student {
    static String course = "Automation"; // static variable
    int id; // instance variable
    String batch;

    Student(int id, String batch) {
        this.id = id;
        this.batch = batch;
    }


    void display() {


        System.out.println("ID: " + id + ", Course: " + course + ", Batch: " + batch);

    }

    public static void main(String[] args) {
        Student s = new Student(234, "ATB10X" );
        s.display();

        
    }
}
