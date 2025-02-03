package ex_15_Strings_Functions;

import java.util.Scanner;

public class LabP1_Strings_Functions {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in); // sc is reference of the object [objet - Scanner(System.in)] of "class Scanner"
        System.out.println("Enter a string: ");
        String s1 = "Ranveer"; // here no object is created
        String str1 = "Hello"; // SCP, OA ? ->   // Creates or reuses "Hello" in the String pool
        String str2 = "Hello";
        String str3 = new String("Hello"); //Creates a new object on the heap

        System.out.println(str1 == str2); // true. Why? -->  references check --> pointing to same location
        System.out.println(str1 == str3);// false - different reference
        System.out.println(str1.equals(str3)); //true, because the content is the same

    }


}
