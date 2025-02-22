package Task16thFeb;

// Abstract Book class
abstract class Book {
    String name;
    String author;
    String price;

    // Constructor
    Book(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Abstract method
    abstract void getDetails();
}

// Concrete subclass PrintMyBook
class PrintMyBook extends Book {
    // Constructor
    PrintMyBook(String name, String author, String price) {
        super(name, author, price);
    }

    // Implement getDetails() method
    @Override
    void getDetails() {
        System.out.println(name + ", " + author + ", " + price);
    }
}

// Main class
public class BookExample {
    public static void main(String[] args) {
        // Creating an object of PrintMyBook using Book reference
        Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");

        // Calling getDetails() method
        myBook.getDetails();
    }
}
