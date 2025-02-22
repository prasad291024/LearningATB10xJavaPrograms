package Task21stFeb;

class Parents {
    static void display() {
        System.out.println("Static method in Parent");
    }
}

class Childs extends Parents {
    static void display() {
        System.out.println("Static method in Child");
    }
}

public class StaticOverrideExample {
    public static void main(String[] args) {
        Parents p = new Childs();
        p.display(); // Calls Parent's method (not overridden)
    }
}
