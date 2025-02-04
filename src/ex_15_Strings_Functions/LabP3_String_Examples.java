package ex_15_Strings_Functions;

public class LabP3_String_Examples {
    public static void main(String[] args) {
        String s1 = "Hello"; // new string
        String s2 = "World"; // new string
        String s3 = s1 + s2; // creates new string
        System.out.println(s3);

        System.out.println(s1.concat(s2));

        StringBuilder sb = new StringBuilder("Sonal");
        System.out.println(sb);
        System.out.println(sb.append(" Harish"));
// StringBuffer , StringBuilder - 2 more ways to create strings.


     }
}
