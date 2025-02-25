package Personal_Practice;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "I love You"; // Declare and initialize the input sentence
        String[] words = sentence.split(" ");
        String reversedSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }
        System.out.println(reversedSentence.trim());
        System.out.println("--------------------------------------------------");

    }
}
