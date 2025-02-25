package ex_19_OOPs_Part2.MethodOverloading;

public class Lab_Overloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        int r = math.add(3,4);
        System.out.println(r);

        int r1 = math.add(3, 4, 5);
        System.out.println(r1);

        double r2 = math.add(3.43, 4.56);
        System.out.println(r2);
    }
}
