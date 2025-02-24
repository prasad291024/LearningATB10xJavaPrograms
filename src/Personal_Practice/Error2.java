package Personal_Practice;

import java.util.ArrayList;

public class Error2 {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();

        while (true) {
            list.add(new int[1000000]); // Continuously allocating memory
        }
    }
}
