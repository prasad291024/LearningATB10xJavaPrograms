package ex_20_OOPs_Super_Abstraction;

public class LabP1_182 {
    public static void main(String[] args) {
        // Creating an object of Car with a parameterized constructor
        System.out.println("Creating Car Object...");
        Car c1 = new Car(100);

        // Calling display method of Car class
        System.out.println("Calling display method...");
        c1.display();
    }
}

// Parent class: Vehicle
class Vehicle {
    public int maxSpeed = 180; // Default max speed for a vehicle

    // Default constructor
    Vehicle() {
        System.out.println("Vehicle: Default Constructor");
    }

    // Parameterized constructor
    Vehicle(int a) {
        System.out.println("Vehicle: Parameterized Constructor with value " + a);
    }

    // Method to test inheritance
    void notest() {
        System.out.println("Vehicle: notest() method called");
    }

    // Method Overloading: Methods with the same name but different arguments

    void message() {
        System.out.println("Vehicle: No Return, No Argument method called");
    }

    void message(int a) {
        System.out.println("Vehicle: Single integer argument method called with value " + a);
    }

    void message(String a) {
        System.out.println("Vehicle: Single string argument method called with value " + a);
    }

    void message(int a, String b) {
        System.out.println("Vehicle: Two arguments (int, String) method called with values " + a + ", " + b);
    }

    void message(String a, int b) {
        System.out.println("Vehicle: Two arguments (String, int) method called with values " + a + ", " + b);
    }

    void message(int a, int b) {
        System.out.println("Vehicle: Two integer arguments method called with values " + a + ", " + b);
    }

    void message(int a, int b, int c) {
        System.out.println("Vehicle: Three integer arguments method called with values " + a + ", " + b + ", " + c);
    }

    void message(int a, int b, int c, int d) {
        System.out.println("Vehicle: Four integer arguments method called with values " + a + ", " + b + ", " + c + ", " + d);
    }

    void message(int a, int b, int c, int d, int e) {
        System.out.println("Vehicle: Five integer arguments method called with values " + a + ", " + b + ", " + c + ", " + d + ", " + e);
    }

    // Normal method to be overridden
    void display() {
        System.out.println("Vehicle: display() method - Parent Class");
    }
}

// Child class: Car (Single Inheritance from Vehicle)
class Car extends Vehicle {
    private int maxSpeed = 281; // Car-specific max speed

    // Default Constructor
    Car() {
        super(100); // Calling parent class parameterized constructor
        System.out.println("Car: Default Constructor");
    }

    // Parameterized Constructor
    Car(int a) {
        System.out.println("Car: Parameterized Constructor with value " + a);
    }

    // Additional method in Car class
    void test() {
        System.out.println("Car: test() method called");
    }

    // Overriding display() method from Vehicle class
    @Override
    void display() {
        System.out.println("Car: Overriding display() method");

        // Accessing parent class variable using super
    }
}