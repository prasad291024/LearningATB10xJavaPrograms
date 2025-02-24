package ex_24_Exceptions;

public class LabP5_Try_Catch {
    public static void main(String[] args) {
        System.out.println("Start!");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
