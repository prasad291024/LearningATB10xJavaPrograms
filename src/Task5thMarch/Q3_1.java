package Task5thMarch;

class Singleton {
    private static Singleton instance; // Static instance

    private Singleton() { // Private constructor
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Q3_1{
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1 == obj2); // ✅ True (both refer to the same instance)
    }
}

