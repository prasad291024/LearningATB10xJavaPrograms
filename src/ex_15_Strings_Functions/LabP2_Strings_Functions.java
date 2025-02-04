package ex_15_Strings_Functions;

public class LabP2_Strings_Functions {
    public static void main(String[] args) {
        String name =  "Sonal";
        // 1. CharAt()  -  Returns the character at the specified index (position)
        System.out.println(name.charAt(3));//Answer --> a

        // 2. length()  -  Returns the length of a specified string
        System.out.println(name.length());//Answer --> 5

        // 3. replace()  -  Searches a string for a specified value, and returns a new string where the specified values are replaced
        System.out.println(name.replace('S','P'));
        //Answer --> Ponal

        // 4.  toLowerCase()  -  Converts a string to lower case letters
        System.out.println(name.toLowerCase());
        //Answer --> sonal

        // 5. toUpperCase()  -  Converts a string to upper case letters
        System.out.println(name.toUpperCase());
        //Answer --> SONAL

        // 6. indexOf()  -  Returns the position of the first found occurrence of specified characters in a string
        System.out.println(name.indexOf("l"));
        //Answer --> 4
        System.out.println(name.indexOf("l", 2)); // this will start searching from index 2. I.e. n
        //Answer --> 4
        String s1 = "madam";
        System.out.println(s1.indexOf("m"));
        //Answer --> 0. It will always tell you first one.

        // 7. lastIndexOf()  -  Returns the position of the last found occurrence of specified characters in a string
        System.out.println(name.lastIndexOf("l"));
        //Answer --> 4

        // 8. equals()  -  Compares two strings, and returns true if the strings are equal, and false if not
        System.out.println(name.equals("Sonal"));
        //Answer --> true
        System.out.println(name.equals("sonal"));
        //Answer --> false


        // 9. equalsIgnoreCase()  -  Compares two strings, ignoring case considerations
        System.out.println(name.equalsIgnoreCase("sonal"));
        //Answer --> true

        // 10. startsWith()  -  Checks whether a string starts with the specified character(s)
        System.out.println(name.startsWith("So"));
        //Answer --> true

        // 11. endsWith()  -  Checks whether a string ends with the specified character(s)
        System.out.println(name.endsWith("al"));
        //Answer --> true

        // 12. substring()  -  Extracts the characters from a string, beginning at a specified start position, and through the specified number of character
        System.out.println(name.substring(2));
        //Answer --> nal

        System.out.println(name.substring(1, 3));
        String ss = "hamburger";
        System.out.println(ss.substring(4,9));



        // 13. trim()  -  Removes whitespace from both ends of a string
        String nonTrimmedString = "     Sonal     ";
        System.out.println(nonTrimmedString); //Answer --> __Sonal__
        System.out.println(nonTrimmedString.trim()); //Answer --> Sonal


        // 14. replace()  -  Searches a string for a specified value, and returns a new string where the specified values are replaced
        System.out.println(name.replace('S', 'P'));
        //Answer --> Ponal

        // 15. concat()  -  Appends a string to the end of another string
        System.out.println(name.concat(" patel"));
        //Answer --> sonal patel

        // 16. compareTo()  -  Compares two strings lexicographically
        System.out.println(name.compareTo("Sonal"));
        //Answer --> 0

        // 17. compareToIgnoreCase()  -  Compares two strings lexicographically, ignoring case differences
        System.out.println(name.compareToIgnoreCase("sonal"));
        //Answer --> 0

        // 18. contains()  -  Checks whether a string contains a sequence of characters
        System.out.println(name.contains("sonal"));
        //Answer --> true
        System.out.println(name.contains("du"));
        //Answer --> false

        // 19. contentEquals()  -  Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
        System.out.println(name.contentEquals("sonal"));
        //Answer --> false
        System.out.println(name.contentEquals("Sonal "));
         // false

        // 20. split()  -  Splits a string into an array of substrings
        String[] words = name.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        String name3 = "Sonal Harish";
        String[] split3 = name3.split(" ");
        System.out.println(split3[0]);
        System.out.println(split3[1]);
        System.out.println(split3[2]);

        String name4 = "pramod@live.com@123";
        String[] split4 = name4.split("@");
        System.out.println(split4[0]);
        System.out.println(split4[1]);
        System.out.println(split4[2]);


        // 21. string builder
        StringBuilder sb = new StringBuilder("Sonal");
        System.out.println(sb);
        //Answer --> Sonal
        System.out.println(sb.append(" Harish"));
        //Answer --> Sonal Harish
        System.out.println(sb.insert(5, " "));
        //Answer --> Sonal Harish
        System.out.println(sb.replace(6, 12, "Harish"));






    }
}
