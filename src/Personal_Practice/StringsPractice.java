package Personal_Practice;
//strings functions -

public class StringsPractice {
    public static void main(String[] args) {
        String name = "Sonali";
        System.out.println(name.length()); // 6
        System.out.println(name.toLowerCase());
        // sonali
        System.out.println(name.toUpperCase());
        // SONALI
        String nonTrimmedString = "     Sonali     ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        // Sonali
        System.out.println(name.substring(2));
        // nali
        System.out.println(name.substring(2, 5));
        // nal
        System.out.println(name.replace('o', 'a'));
        // Sanali
        System.out.println(name.replace("o", "aa"));
        // Sanaaaa
        System.out.println(name.startsWith("So"));
        // true
        System.out.println(name.endsWith("li"));
        // true
        System.out.println(name.charAt(3));
        // a
        System.out.println(name.indexOf("a"));
        // 1
        System.out.println(name.indexOf("a", 2));
        // 4
        System.out.println(name.lastIndexOf("a"));
        // 4
        System.out.println(name.lastIndexOf("a", 3));
        // 1
        System.out.println(name.equals("Sonali"));
        // true
        System.out.println(name.equals("sonali"));
        // false
        System.out.println(name.equalsIgnoreCase("sonali"));
        System.out.println("I am escape sequence \" double quote");
        // I am escape sequence " double quote
        System.out.println("I am escape sequence \\ double quote");
        System.out.println("I am escape sequence \n double quote");
        // I am escape sequence
        // double quote
        System.out.println("I am escape sequence \t double quote");
        System.out.println("I am escape sequence \r double quote");
        System.out.println("I am escape sequence \b double quote");


    }
}
