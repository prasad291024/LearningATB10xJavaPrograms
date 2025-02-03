package Task1stFeb;

import java.util.Scanner;

public class Q3_Website_Domains {
    public static void main(String[] args) {
        // Step 1: Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the website URL: ");
        String url = scanner.nextLine();


        String[] parts = url.split("\\."); // Split by dot (.)
        String extension = parts[parts.length - 1]; // Get the last part
        System.out.println("Domain Extension: " + extension);

        // Step 3: Determine website type
        String websiteType;
        switch (extension) {
            case "com":
                websiteType = "Commercial website";
                break;
            case "org":
                websiteType = "Non-profit organization";
                break;
            case "edu":
                websiteType = "Educational institution";
                break;
            case "gov":
                websiteType = "Government website";
                break;
            case "net":
                websiteType = "Network-related website";
                break;
            case "info":
                websiteType = "Informational website";
                break;
            default:
                websiteType = "Unknown or other types of websites";
        }

        // Step 4: Print the result
        System.out.println("The website type is: " + websiteType);

        scanner.close();
    }
}
