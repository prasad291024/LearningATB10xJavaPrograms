package ex_14_Strings;

public class LabP7_Strings_Interview {
    public static void main(String[] args) {

        String s1 = "Hello"; // SCP = 1
        String s4 = "Hello"; // 1

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");
        String s5 = new String("hello"); //  OA = 3

        System.out.println("---------------Comparison---------------------");
        // == ?  Comparsion -> Strings -> This check the locations ref.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4); // true --> location reference
        System.out.println(s3 == s5); // false --> new independent strings are created here


        System.out.println("-------------------Equals----------------------");
        // equals ( content) -> to check the value
        // How can I check the values? equals == value

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5)); // F -> difference in case
        System.out.println(s3.equalsIgnoreCase(s5)); // T



//  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD




    }
}
