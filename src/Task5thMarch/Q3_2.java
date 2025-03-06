package Task5thMarch;

class MathUtils {
    private MathUtils() { } // Private constructor

    public static int square(int x) {
        return x * x;
    }
}

public class Q3_2 {
    public static void main(String[] args) {
        // MathUtils obj = new MathUtils(); ❌ ERROR: Cannot instantiate
        System.out.println(MathUtils.square(5)); // ✅ 25
    }
}

