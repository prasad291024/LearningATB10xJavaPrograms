package Personal_Practice;

public class countV_C_Copy {
    public static void main(String[] args) {
        String str = "This is a JAVA Programming prctice ";
        int vcount =0, ccount = 0; // two variables declare
        str = str.toLowerCase(); // converted string to lowercase

        // now use for loop to iterate through each character in string
        for (int i = 0; i < str.length(); i ++){

        // use if else condition to check each letter is vowel or consonent
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vcount++;
            }
            else if(str.charAt(i) >= 'a' && (str.charAt(i) <= 'z' )){
                ccount++;
            }
            }
        System.out.println("Number of vowels: " + vcount);
        System.out.println("Number of consonants: " + ccount);
        }
 }

