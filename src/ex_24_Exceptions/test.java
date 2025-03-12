package ex_24_Exceptions;

public class test {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("pause");
        try {
            int b = a/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("continue");
    }
}
