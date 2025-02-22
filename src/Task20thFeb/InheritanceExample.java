// Parent class
class Vehicle {
    String brand = "Toyota";

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Child class inheriting Vehicle class
class Car extends Vehicle {
    int speed = 120;

    void showDetails() {
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Main class to test Inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displayBrand(); // Inherited from Vehicle
        myCar.showDetails();  // Car-specific method
    }
}
