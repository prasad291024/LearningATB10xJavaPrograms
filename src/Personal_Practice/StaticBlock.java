package Personal_Practice;

class StaticBlockTest {
    static int x;
    int y; // Instance variable

    // Static block to initialize static variable x
    static {
        x = 10;
        System.out.println("Static block executed. x = " + x);
    }

    // Instance block to initialize instance variable y
    {
        y = 20;
        System.out.println("Instance block executed. y = " + y);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        // Creating an instance of StaticBlockTest
      //  StaticBlockTest test = new StaticBlockTest();
        // Accessing instance variable y
      //  System.out.println("Instance variable y = " + test.y);

        // Accessing static variable x
        System.out.println("Static variable x = " + StaticBlockTest.x);
    }
}
