package Personal_Practice;

public class Error1 {
    public static void recursiveMethod() {
        recursiveMethod(); // Infinite recursion
    }

    public static void main(String[] args) {
        recursiveMethod(); // This will cause StackOverflowError
    }
}
