package Personal_Practice;

public class StringsCompare {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Yellow";
        String s3 = new String("Hello");
        String s4 = new String("Yellow");
        String s5 = "hello";
        String s6 = "yELLOw";

        // Compare using compareTo (case-sensitive)
        System.out.println("compareTo results:");
        System.out.println(s1.compareTo(s2));  // Negative value
        System.out.println(s1.compareTo(s3));  // 0 (same content)
        System.out.println(s1.compareTo(s5));  // Negative value (ASCII difference)
        System.out.println(s2.compareTo(s4));  // 0 (same content)
        System.out.println(s2.compareTo(s6));  // Negative value (ASCII difference)

        System.out.println("\ncompareToIgnoreCase results:");
        // Compare ignoring case
        System.out.println(s1.compareToIgnoreCase(s5));  // 0 (same content, ignores case)
        System.out.println(s2.compareToIgnoreCase(s6));  // 0 (same content, ignores case)

        System.out.println("\nequals and equalsIgnoreCase results:");
        // Using equals() (case-sensitive)
        System.out.println(s1.equals(s3));  // true
        System.out.println(s1.equals(s5));  // false (case-sensitive)

        // Using equalsIgnoreCase() (case-insensitive)
        System.out.println(s1.equalsIgnoreCase(s5));  // true

        System.out.println("\nChecking if one string contains another:");
        // Check if one string contains another
        System.out.println(s2.contains("ell"));  // true ("Yellow" contains "ell")
        System.out.println(s5.contains("HEL"));  // false (case-sensitive)

        System.out.println("\nConverting string cases:");
        // Convert to uppercase and lowercase
        System.out.println(s5.toUpperCase());  // "HELLO"
        System.out.println(s6.toLowerCase());  // "yellow"

        System.out.println("\nFinding string length:");
        // Find string length
        System.out.println("Length of s1: " + s1.length());  // 5

        System.out.println("\nGetting characters:");
        // Access individual characters
        System.out.println("First character of s1: " + s1.charAt(0));  // H
        System.out.println("Last character of s1: " + s1.charAt(s1.length() - 1));  // o
    }
}
