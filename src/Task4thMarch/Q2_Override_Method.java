package Task4thMarch;

class Q2Parent {
    private void show() {
        System.out.println("Parent class private method");
    }
}

class Child extends Q2Parent {
    void show() { // This is NOT overriding but a new method
        System.out.println("Child class method");
    }
}

public class Q2_Override_Method {
    public static void main(String[] args) {
        Q2Parent obj = new Child();
        // obj.show(); ❌ ERROR: Cannot access private method from Parent
    }
}


