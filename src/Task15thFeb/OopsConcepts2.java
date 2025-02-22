package Task15thFeb;

// ENUM - Defines a set of constant values
enum Color {
    RED, GREEN, BLUE;
}

// STATIC - Example of a static variable and method
class StaticExample {
    static int count = 0; // Static variable shared among all objects

    // Static method
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    // Constructor to increment count when an object is created
    StaticExample() {
        count++;
    }
}

// WRAPPER CLASS - Converting primitive to object and vice versa
class WrapperExample {
    void showWrapperDemo() {
        int primitiveInt = 10;
        Integer wrappedInt = Integer.valueOf(primitiveInt); // Boxing (Primitive → Object)
        int unwrappedInt = wrappedInt.intValue(); // Unboxing (Object → Primitive)

        System.out.println("Primitive: " + primitiveInt);
        System.out.println("Wrapped Object: " + wrappedInt);
        System.out.println("Unwrapped Primitive: " + unwrappedInt);
    }
}

// ACCESS MODIFIERS - Private, Public, Protected, Default
class AccessModifierExample {
    private String privateMessage = "Private Access"; // Accessible only in this class
    public String publicMessage = "Public Access"; // Accessible everywhere
    protected String protectedMessage = "Protected Access"; // Accessible in subclasses
    String defaultMessage = "Default (Package-Private) Access"; // Accessible within the same package

    public String getPrivateMessage() {
        return privateMessage; // Accessing private variable using a method
    }
}

// SUPER KEYWORD - Calling parent class methods and constructors
class Parent {
    String name = "Parent Class";

    Parent() {
        System.out.println("Parent Constructor Called");
    }

    void show() {
        System.out.println("Hello from Parent Class");
    }
}

// Child class using super keyword
class Child extends Parent {
    String name = "Child Class";

    Child() {
        super(); // Calls parent constructor
        System.out.println("Child Constructor Called");
    }

    void display() {
        System.out.println("Child Name: " + name);
        System.out.println("Parent Name using super: " + super.name); // Accessing parent variable
        super.show(); // Calling parent method
    }
}

// ABSTRACTION - Using abstract class
abstract class Vehicle {
    abstract void start(); // Abstract method (must be implemented by subclasses)

    void commonFeature() {
        System.out.println("All vehicles have wheels.");
    }
}

// Concrete class implementing abstract method
class Cars extends Vehicle {
    void start() {
        System.out.println("Car starts with a key!");
    }
}

// MAIN CLASS - Executing all examples
public class OopsConcepts2 {
    public static void main(String[] args) {
        // ENUM Example
        Color myColor = Color.RED;
        System.out.println("Selected Color: " + myColor);

        // STATIC Example
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample.displayCount(); // Accessing static method

        // WRAPPER CLASS Example
        WrapperExample wrapperObj = new WrapperExample();
        wrapperObj.showWrapperDemo();

        // ACCESS MODIFIER Example
        AccessModifierExample accessObj = new AccessModifierExample();
        System.out.println("Public: " + accessObj.publicMessage);
        System.out.println("Protected: " + accessObj.protectedMessage);
        System.out.println("Default: " + accessObj.defaultMessage);
        System.out.println("Private (via method): " + accessObj.getPrivateMessage());

        // SUPER Keyword Example
        Child childObj = new Child();
        childObj.display();

        // ABSTRACTION Example
        Vehicle myCars = new Cars();
        myCars.start();
        myCars.commonFeature();
    }
}
