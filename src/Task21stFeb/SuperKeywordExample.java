package Task21stFeb;

// Parent class
class Vehicle {
    String brand = "Toyota";

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Child class
class Car extends Vehicle {
    String brand = "Honda"; // Same variable as parent

    void showBrand() {
        System.out.println("Child class brand: " + brand); // Child's variable
        System.out.println("Parent class brand: " + super.brand); // Access parent variable
    }

    void display() {
        super.displayBrand(); // Call parent class method
    }
}

// Main class
public class SuperKeywordExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.showBrand();
        myCar.display();
    }
}

