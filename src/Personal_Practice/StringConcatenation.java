package Personal_Practice;

public class StringConcatenation {
    public static void main(String[] args) {
        // Define two strings
        String str1 = "Hello, ";
        String str2 = "World!";
        String str3 = "Java ";
        String str4 = "Programming";

        // Concatenate using concat() method
        String result = str1.concat(str2);

        // Concatenate using + operator
        String result2 = str3 + str4;

        // Print the result
        System.out.println(result);
        System.out.println(result2);
    }
}
