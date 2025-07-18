package Personal_Practice;

public class OperatorsDemo {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));  // 13
        System.out.println("a - b = " + (a - b));  // 7
        System.out.println("a * b = " + (a * b));  // 30
        System.out.println("a / b = " + (a / b));  // 3 (integer division)
        System.out.println("a % b = " + (a % b));  // 1 (remainder)

        // 2. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int x = 5;
        System.out.println("Initial x = " + x);
        x += 3;  // x = x + 3
        System.out.println("After x += 3: " + x);  // 8
        x -= 2;  // x = x - 2
        System.out.println("After x -= 2: " + x);  // 6
        x *= 2;  // x = x * 2
        System.out.println("After x *= 2: " + x);  // 12

        // 3. Comparison Operators
        System.out.println("\n=== Comparison Operators ===");
        int num1 = 15, num2 = 20;
        System.out.println("num1 == num2: " + (num1 == num2));  // false
        System.out.println("num1 != num2: " + (num1 != num2));  // true
        System.out.println("num1 > num2: " + (num1 > num2));    // false
        System.out.println("num1 < num2: " + (num1 < num2));    // true
        System.out.println("num1 >= 15: " + (num1 >= 15));      // true

        // 4. Logical Operators
        System.out.println("\n=== Logical Operators ===");
        boolean isStudent = true;
        boolean hasGoodGrades = false;
        System.out.println("isStudent && hasGoodGrades: " + (isStudent && hasGoodGrades));  // false
        System.out.println("isStudent || hasGoodGrades: " + (isStudent || hasGoodGrades));  // true
        System.out.println("!isStudent: " + (!isStudent));  // false

        // 5. Unary Operators
        System.out.println("\n=== Unary Operators ===");
        int count = 5;
        System.out.println("Original count: " + count);
        System.out.println("count++ (post-increment): " + count++);  // 5, then becomes 6
        System.out.println("After post-increment: " + count);        // 6
        System.out.println("++count (pre-increment): " + ++count);   // 7
        System.out.println("count-- (post-decrement): " + count--);  // 7, then becomes 6
        System.out.println("Final count: " + count);                 // 6

        // 6. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int age = 18;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age: " + age + ", Status: " + status);

        // 7. Bitwise Operators (basic example)
        System.out.println("\n=== Bitwise Operators ===");
        int p = 5;  // Binary: 101
        int q = 3;  // Binary: 011
        System.out.println("p & q = " + (p & q));  // 1 (Binary: 001)
        System.out.println("p | q = " + (p | q));  // 7 (Binary: 111)
        System.out.println("p ^ q = " + (p ^ q));  // 6 (Binary: 110)

        // 8. Operator Precedence Example
        System.out.println("\n=== Operator Precedence ===");
        int result = 10 + 5 * 2;  // Multiplication first, then addition
        System.out.println("10 + 5 * 2 = " + result);  // 20 (not 30)

        int result2 = (10 + 5) * 2;  // Parentheses change precedence
        System.out.println("(10 + 5) * 2 = " + result2);  // 30
    }
}
