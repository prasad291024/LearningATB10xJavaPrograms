package Task4thMarch;

public class Q3_ProtectedExample {
    protected void display() {
        System.out.println("Protected access method");
    }
}

class DefaultExample {
    void display() {  // default access modifier
        System.out.println("Default access method");
    }
}