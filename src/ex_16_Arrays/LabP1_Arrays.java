package ex_16_Arrays;

public class LabP1_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int [] marks = {43, 56, 76, 58, 79, 65}; // Array creation with predefined elements

        System.out.println(marks[0]); // first element of the array. indexing starts from 0
        System.out.println(marks[3]); // fourth element of the array
     //   System.out.println(marks[-1]); // negative index is not allowed
     //   System.out.println(marks[6]); // index out of bound exception
        System.out.println(marks[5]); // last element of the array
        System.out.println("=====================================");

        System.out.println(marks);
        System.out.println("=====================================");

        System.out.println(marks[0] + marks[1] + marks[2] + marks[3] + marks[4] + marks[5]);//Addition of arrays

        System.out.println("=====================================");

        System.out.println(marks.length);// length of array. length starts from 1
        System.out.println("=====================================");


        // print all elements of the array
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("=====================================");

        // print all elements of the array in reverse order
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
        System.out.println("=====================================");


        System.out.println(marks[marks.length - 1]); // last element of the array
        System.out.println(marks[marks.length - 2]);
        System.out.println("=====================================");

    }


}
