package Personal_Practice;

public class SplitString {
    public static void main(String[] args) {
        String str = "Hello World from JAVA";
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("Number of Strings: " +strArray.length);
    }
}
// Enhanced for loop can also be used
// for (String s : strArray) {
//            System.out.println(s);
//        }