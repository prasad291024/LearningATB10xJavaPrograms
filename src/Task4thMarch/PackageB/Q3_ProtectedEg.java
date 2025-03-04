package Task4thMarch.PackageB;

import Task4thMarch.Q3_ProtectedExample;

class Q3_ProtectedEg extends Q3_ProtectedExample {
    public static void main(String[] args) {
        Q3_ProtectedEg obj = new Q3_ProtectedEg(); // ✅ Use subclass reference
        obj.display(); // ✅ Allowed (protected is accessible in subclasses)
    }
}
