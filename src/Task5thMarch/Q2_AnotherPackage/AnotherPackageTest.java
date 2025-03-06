package Task5thMarch.Q2_AnotherPackage;

import Task5thMarch.AccessDemo;

public class AnotherPackageTest extends AccessDemo {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        // System.out.println(obj.defaultMessage); ❌ ERROR: Default is not accessible outside the package
        // System.out.println(obj.protectedMessage); ❌ ERROR: Protected is not accessible without inheritance
        System.out.println(obj.publicMessage);    // ✅ Allowed (public is accessible anywhere)

        AnotherPackageTest subObj = new AnotherPackageTest();
        System.out.println(subObj.protectedMessage); // ✅ Allowed (protected is accessible in subclass)
    }

}
