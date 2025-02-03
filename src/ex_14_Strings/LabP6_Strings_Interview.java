package ex_14_Strings;

public class LabP6_Strings_Interview {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP
        String s4 = "Hello"; // SCP >
        // only one string is created in SCP.
        // Since hello string is present already, s4 will be pointed to hello string created earlier.
        String s10 = "Hello"; // SCP >

        String s2 = new String("Hello"); //this string is went to Object Area
        String s3 = new String("Hello");
        // in object area, fresh string is created everytime. Although string is equal or not
        String s5 = new String("hello");

        // == -> comparsion
    }
}
