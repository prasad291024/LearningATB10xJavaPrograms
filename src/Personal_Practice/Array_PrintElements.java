package Personal_Practice;



public class Array_PrintElements {
    public static void main(String[] args) {
        int myarray[] = {34, 66, 65, 21, 66, 55, 66};
        System.out.print("Array Elements :");
        for(int i = 0; i <myarray.length; i++)
        {
            System.out.print(" " + myarray[i]);
        }
        System.out.println();
        System.out.println("Array String Elements :");
        String textarray[] = {"Hey", "Man", "Be", "original"};
        for(int i = 0; i < textarray.length; i++)
        {
            System.out.println(textarray[i]);
        }

        // lets create array of boolean type
        System.out.println("Array boolean Elements :");
        boolean boolarray[] = {true, false, true, false};
        for(int i = 0; i < boolarray.length; i++)
        {
            System.out.println(boolarray[i]);
        }
        // lets create array of double type
        System.out.println("Array double Elements :");
        double doublearray[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        for(int i = 0; i < doublearray.length; i++)
        {
            System.out.println(doublearray[i]);
        }
        // lets create array of character type
        System.out.println("Array character Elements :");
        char chararray[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        for(int i = 0; i < chararray.length; i++)
        {
            System.out.println(chararray[i]);
        }


        System.out.println("Enhanced for loop");
        for (int element : myarray) // enhanced for loop - works for only Array
        {
            System.out.println(element);
        }
    }
}
