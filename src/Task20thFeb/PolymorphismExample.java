package Task20thFeb;

// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding makeSound method
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound(); // Calls Dog's makeSound method
    }
}

