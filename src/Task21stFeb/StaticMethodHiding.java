package Task21stFeb;

class Parent {
    static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Static method in Child class");
    }
}

public class StaticMethodHiding {
    public static void main(String[] args) {
        Parent obj = new Child(); // Reference of Parent, object of Child
        obj.display(); // Calls Parent's static method, not Child's method
    }
}
