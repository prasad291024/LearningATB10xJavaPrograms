package ex_14_Strings;

public class LabP3_Strings_new_keyword {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP
        String s2 = new String("Hello"); // OA
        String s3 = "Hello"; // SCP

        //content is same but reference is different.
        System.out.println(s1 == s2);
         // false
        System.out.println(s1 == s3);
         // true
        System.out.println(s1.equals(s2));
        // true
        System.out.println(s1.equals(s3)); //Here, checks the
        System.out.println(s2.equals(s3));

    }
}

