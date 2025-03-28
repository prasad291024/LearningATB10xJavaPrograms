package ex_22_Enum;
enum Colors {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String hexCode;

    Colors(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}

enum Locators {
    page_button("//button[@id='submit']"),
    login_field("//input[@id='username']"),
    password_field("//input[@id='password']");

    private String locator;

    Locators(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}

enum APIURLS {
    katalon("https://katalon.com/api"),
    google("https://google.com/api"),
    github("https://github.com/api");

    private String url;

    APIURLS(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

public class LabP3_Enum3 {
    public static void main(String[] args) {
        System.out.println(Colors.RED.getHexCode());
        System.out.println(Locators.page_button.getLocator());
        System.out.println(APIURLS.katalon.getUrl());

        // Properties - can read from the external file - Collection Framework
        // data.properties - key and value
    }
}
