package ex_19_OOPs_Part2.Inheritance.Hierarchical_Inheritance;

public class Lab_Hierarchical {
    public static void main(String[] args) {
        Son_Pramesh s1 = new Son_Pramesh();
        s1.home(); // Son Pramesh can use fathers home
        s1.h2(); // his own class


        Son_Lucky s2 = new Son_Lucky();
        s2.home(); // Son Lucky can use fathers home
        s2.l2();// his own class


        Daughter_Ruhani d1 = new Daughter_Ruhani();
        d1.home(); // Daughter can use fathers home
        d1.d2();// own class

    }
}