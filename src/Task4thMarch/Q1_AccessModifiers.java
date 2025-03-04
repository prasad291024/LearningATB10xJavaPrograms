package Task4thMarch;

public class Q1_AccessModifiers {
    private int privateVar = 10;    // Accessible only in this class
    int defaultVar = 20;            // Accessible within the same package
    protected int protectedVar = 30; // Accessible in the same package + subclasses
    public int publicVar = 40;      // Accessible from anywhere

    public static void main(String[] args) {
        Q1_AccessModifiers obj = new Q1_AccessModifiers();
        System.out.println(obj.privateVar);  // ✅ Allowed (inside the same class)
        System.out.println(obj.defaultVar); // ✅ Allowed (same package)
        System.out.println(obj.protectedVar); // ✅ Allowed (same package + subclasses)
        System.out.println(obj.publicVar);
    }
}
