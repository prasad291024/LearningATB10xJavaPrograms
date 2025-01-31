package Personal_Practice;

public class StringFunctions1 {
    public static void main(String[] args) {
        // Declare a string
        String str = "  Hello, Java Programming!  ";

        // 1. length() - Returns the length of the string
        System.out.println("Length: " + str.length());

        // 2. charAt() - Returns character at specified index
        System.out.println("Character at index 7: " + str.charAt(7));

        // 3. substring() - Extracts a part of the string
        System.out.println("Substring (7, 11): " + str.substring(7, 11));

        // 4. equals() - Compares two strings (case-sensitive)
        System.out.println("Equals 'Hello, Java Programming!': " + str.trim().equals("Hello, Java Programming!"));

        // 5. equalsIgnoreCase() - Compares two strings (case-insensitive)
        System.out.println("Equals Ignore Case 'hello, java programming!': " + str.trim().equalsIgnoreCase("hello, java programming!"));

        // 6. compareTo() - Compares two strings lexicographically
        System.out.println("CompareTo 'Hello': " + str.trim().compareTo("Hello"));

        // 7. toUpperCase() - Converts to uppercase
        System.out.println("Upper Case: " + str.toUpperCase());

        // 8. toLowerCase() - Converts to lowercase
        System.out.println("Lower Case: " + str.toLowerCase());

        // 9. trim() - Removes leading and trailing spaces
        System.out.println("Trimmed String: '" + str.trim() + "'");

        // 10. replace() - Replaces characters
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 11. contains() - Checks if string contains a specific sequence
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 12. startsWith() - Checks if string starts with a specific prefix
        System.out.println("Starts with '  Hello': " + str.startsWith("  Hello"));

        // 13. endsWith() - Checks if string ends with a specific suffix
        System.out.println("Ends with 'Programming!  ': " + str.endsWith("Programming!  "));

        // 14. indexOf() - Finds the first occurrence of a character or substring
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // 15. lastIndexOf() - Finds the last occurrence of a character or substring
        System.out.println("Last index of 'a': " + str.lastIndexOf("a"));

        // 16. isEmpty() - Checks if the string is empty
        System.out.println("Is Empty: " + str.isEmpty());

        // 17. split() - Splits the string into an array based on a delimiter
        String[] words = str.split(" ");
        System.out.print("Split words: ");
        for (String word : words) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();

        // 18. join() - Joins multiple strings with a delimiter
        String joinedString = String.join("-", "Hello", "World", "Java");
        System.out.println("Joined String: " + joinedString);

        // 19. toCharArray() - Converts string into a character array
        char[] charArray = str.toCharArray();
        System.out.print("Character Array: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 20. valueOf() - Converts different types to string
        int number = 100;
        System.out.println("String value of 100: " + String.valueOf(number));
    }
}
