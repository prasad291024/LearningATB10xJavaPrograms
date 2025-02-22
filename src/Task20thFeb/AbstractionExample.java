package Task20thFeb;

// Abstract class
abstract class Shape {
    abstract void draw(); // Abstract method (no body)
}

// Concrete class implementing abstract method
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class
public class AbstractionExample {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();

        Shape s2 = new Rectangle();
        s2.draw();
    }
}
