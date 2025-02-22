package Task15thFeb;

// 1. Encapsulation
class Car {
    private String brand; // Private variable

    // Constructor
    Car(String brand) {
        this.brand = brand;
    }

    // Getter method to access private variable
    public String getBrand() {
        return brand;
    }
}

// 2. Inheritance
class SportsCar extends Car {
    private int speed;

    SportsCar(String brand, int speed) {
        super(brand); // Calling parent class constructor
        this.speed = speed;
    }

    public void showSpeed() {
        System.out.println(getBrand() + " has a top speed of " + speed + " km/h.");
    }
}

// 3. Polymorphism
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// 4. Abstraction
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Main class to run the program
public class OopsConcepts1 {
    public static void main(String[] args) {
        // Encapsulation
        Car myCar = new Car("Toyota");
        System.out.println("Car brand: " + myCar.getBrand());

        // Inheritance
        SportsCar sc = new SportsCar("Ferrari", 350);
        sc.showSpeed();

        // Polymorphism
        Animal myAnimal = new Dog();
        myAnimal.makeSound(); // Calls Dog's makeSound() method

        // Abstraction
        Shape s = new Circle();
        s.draw();
    }
}
