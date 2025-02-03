package Task2ndFeb;

public class StringFunctions2 {
    public static void main(String[] args) {
        String str = "  Java Programming is fun!  ";
        String str1 = "Java";
        String str2 = "java";

        // 1. trim() - Removes leading and trailing spaces
        System.out.println("Trimmed String: '" + str.trim() + "'");

        // 2. startsWith() - Checks if string starts with a given prefix
        System.out.println("Starts with 'Java': " + str.startsWith("Java"));

        // 3. endsWith() - Checks if string ends with a given suffix
        System.out.println("Ends with 'fun!': " + str.endsWith("fun!  "));

        // 4. replace() - Replaces characters or substrings
        System.out.println("Replace 'fun' with 'awesome': " + str.replace("fun", "awesome"));

        // 5. replaceAll() - Replaces all occurrences using regex
        System.out.println("Replace all vowels with '*': " + str.replaceAll("[AEIOUaeiou]", "*"));

        // 6. matches() - Checks if string matches a regex pattern
        System.out.println("Contains only alphabets: " + str.matches("[a-zA-Z ]+"));

        // 7. split() - Splits string based on a delimiter
        String[] words = str.split(" ");
        System.out.println("Words in string:");
        for (String word : words) {
            System.out.println(word);
        }

        // 8. isEmpty() - Checks if the string is empty
        String emptyStr = "";
        System.out.println("Is empty string: " + emptyStr.isEmpty());

        // 9. format() - Formats a string using placeholders
        String formattedStr = String.format("My name is %s and I am %d years old.", "Alice", 25);
        System.out.println("Formatted String: " + formattedStr);

        // 10. join() - Joins strings with a delimiter
        String joinedStr = String.join(" - ", "Apple", "Banana", "Cherry");
        System.out.println("Joined String: " + joinedStr);

        // 11. contains() - Checks if string contains a sequence
        System.out.println("Contains 'Programming': " + str.contains("Programming"));

        // 12. indexOf() - Finds first occurrence of a character or substring
        System.out.println("Index of 'P': " + str.indexOf('P'));

        // 13. lastIndexOf() - Finds last occurrence of a character or substring
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));

        // 14. compareTo() - Compares two strings lexicographically
        System.out.println("Compare 'Java' and 'java': " + str1.compareTo(str2));

        // 15. compareToIgnoreCase() - Compares strings ignoring case
        System.out.println("Compare ignoring case: " + str1.compareToIgnoreCase(str2));

        // 16. toCharArray() - Converts string to character array
        char[] charArray = str.toCharArray();
        System.out.print("Character array: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 17. repeat() - Repeats a string multiple times (Java 11+)
        System.out.println("Repeat 'Hi' 3 times: " + "Hi ".repeat(3));

        // 18. strip() - Removes leading and trailing whitespace (Java 11+)
        System.out.println("Stripped String: '" + str.strip() + "'");

        // 19. stripLeading() - Removes leading whitespace only
        System.out.println("Leading Stripped: '" + str.stripLeading() + "'");

        // 20. stripTrailing() - Removes trailing whitespace only
        System.out.println("Trailing Stripped: '" + str.stripTrailing() + "'");
    }
}
