package ex_14_Strings;

public class LabP8_Strings_Functions_Intro {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        char aChar = anotherPalindrome.charAt(9);
        System.out.println(aChar);
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar); // it will print roar
        String roar2 = anotherPalindrome.substring(16, 21);
        System.out.println(roar2);
    }

}
