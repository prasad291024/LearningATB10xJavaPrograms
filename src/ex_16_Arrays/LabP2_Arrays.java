package ex_16_Arrays;

public class LabP2_Arrays {
    public static void main(String[] args) {
        //method 1
        int[] marks1 = {1, 2, 3, 4, 5, 6};//predefined array
        System.out.println(marks1.length);

        //method 2
        int[] marks2 = new int[5]; //here we are creating an array of size 5. It is always will be fix size
        System.out.println(marks2.length); // this is property of array. It will give the length of the array.
        //this is not a function

        String s2 = "Palak";
        // this is a string literal. It is a string object
        System.out.println(s2.length());// this is function

        marks2[0] = 91; // this is how we can assign value to an array
        marks2[1] = 12;
        marks2[2] = 13;
        marks2[3] = 14;
        marks2[4] = 15;

        System.out.println(marks2[0]); // Ans = 91
        System.out.println(marks2[4]); // Ans = 15

    }
}
