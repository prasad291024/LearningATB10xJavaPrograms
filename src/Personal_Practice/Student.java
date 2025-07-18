package Personal_Practice;

public class Student {
    static String course = "Automation"; // static variable
    int id; // instance variable

    Student(int id) {
        this.id = id;
    }

    void batchinfo()
    {
        String batch = "Fresh";
    }

    void display() {


        System.out.println("ID: " + id + ", Course: " + course + "batch: " + Batch);

    }

    public static void main(String[] args) {
        Student s = new Student();
        String Batch = s.batchinfo();
        
    }
}
