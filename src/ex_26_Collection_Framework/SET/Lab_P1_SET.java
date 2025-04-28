package ex_26_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_P1_SET {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Prasad");
        hs.add("Prasad");
        hs.add("prasad");
        hs.add("drasad");
        System.out.println(hs);
    }
}