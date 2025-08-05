package Personal_Practice;

public class Demo9 {

    public static void main(String[] args) {
        int age = 21;
        long salary = 2500;

        //both must be true
        if(age > 18 || salary > 2000000 )
        {
            System.out.println("partially eligible");
        }
        else
        {
            System.out.println("not eligible");
        }
    }
}
