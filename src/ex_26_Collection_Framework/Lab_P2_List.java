package ex_26_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab_P2_List {
    public static void main(String[] args) {

//        List fruits = List.of("orange","apple","banana","mango","watermelon");
//        System.out.println(fruits);
        // Static method can be fully implemented in interface.
        // Default method - can full implemented in interface.
        //fruits.add("Chery"); // java.lang.UnsupportedOperationException
        //fruits.remove("apple"); // Not possible

        ArrayList arrayList = new ArrayList();
        arrayList.add("pramod");
        arrayList.add(null);
        arrayList.add("dutta");
        arrayList.add("dutta"); // Duplicate is allowed.
        arrayList.add(123); // Different data type is allowed.
        arrayList.add(true);//
        arrayList.add(true);
        arrayList.add(false);
        arrayList.add(43.22);




        System.out.println(arrayList);
        System.out.println(arrayList.size());

        System.out.println(arrayList.get(0)); // pramod
        System.out.println(arrayList.get(1)); // null
        System.out.println(arrayList.get(4)); // 123
        System.out.println(arrayList.get(5)); // true
        System.out.println("---------------------------------------");

        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);





    }
}
