package ex_22_Enum;

public class Labp2_Enum2 {
    public static void main(String[] args) {
        System.out.println(URLS.katalon);
        if (URLS.katalon.equals("katalon")) {
            System.out.println("I want to do somethings");
        }
    }
}
// Enum is nothing
enum URLS {
    google, restassured, katalon, vwo
}
