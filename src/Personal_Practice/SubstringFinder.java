package Personal_Practice;

public class SubstringFinder {
        public static void main(String[] args) {
            String name = "Selenium ";

            System.out.println("All possible substrings of the given string: \n");
            findAllSubstrings(name);
        }

        public static void findAllSubstrings(String str) {
            int length = str.length();

            // Iterate over all possible starting points of substrings
            for (int i = 0; i < length; i++) {
                // Iterate over all possible ending points of substrings
                for (int j = i + 1; j <= length; j++) {
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }


