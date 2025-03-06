package Task5thMarch;

public class SamePackageTest {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        // System.out.println(obj.privateMessage); ❌ ERROR: Private member is not accessible
        System.out.println(obj.defaultMessage);   // ✅ Allowed (same package)
        System.out.println(obj.protectedMessage); // ✅ Allowed (same package)
        System.out.println(obj.publicMessage);    // ✅ Allowed (public is accessible anywhere)
    }
}
