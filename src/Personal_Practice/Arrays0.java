package Personal_Practice;

import java.util.Arrays;

public class Arrays0 {

    public static void main(String[] args) {

        int marks0[] = new int[5];
        int marks1[] = {5, 2, 9, 3, 8};

        marks0[0] = 19;
        marks0[1] = 12;
        marks0[2] = 13;
        marks0[3] = 11;
        marks0[4] = 13;
        System.out.print("This is the marks of first Array i.e. marks0: ");
        for (int i = 0; i < marks0.length; i++) {

            System.out.print( " " + marks0[i]+ " ");
        }

        for(int j =0; j < marks1.length; j++)
        {
            System.out.println(marks1[j]);
        }







    }
}
