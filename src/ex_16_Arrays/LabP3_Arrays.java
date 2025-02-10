package ex_16_Arrays;

public class LabP3_Arrays {
    public static void main(String[] args) {
        String[] names = {"Palak", "Raj", "Rahul", "Rajesh", "Rajeshwari", "Anuj", "Rajani"};
        System.out.println(names.length); // length of array // ANs = 7
        System.out.println(names[0]); // first element of the array
        System.out.println(names[6]); // last element of the array

        System.out.println("=====================================");

        // print all elements of the array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("=====================================");

            System.out.println(names.length);


    }
}
