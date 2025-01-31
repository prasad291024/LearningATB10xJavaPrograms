package Personal_Practice;

public class StringSplit {
    public static void main(String[] args) {
        // Define a string
        String text = "apple,banana,grape";

        // Split the string using "," as a delimiter
        String[] fruits = text.split(",");

        // Print the result
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
