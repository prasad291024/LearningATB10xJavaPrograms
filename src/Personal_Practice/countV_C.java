package Personal_Practice;

public class countV_C {
    public static void main(String[] args) {
        String str = "Hello World";

        int vCount = 0, cCount = 0; //
        str = str.toLowerCase(); // converts string to lowercase
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
