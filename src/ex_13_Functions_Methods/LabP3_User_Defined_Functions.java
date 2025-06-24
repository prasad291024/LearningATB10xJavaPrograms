package ex_13_Functions_Methods;

public class LabP3_User_Defined_Functions {
    public static void main(String[] args) { // JVM program(running RAM)
        // Step 2 - Call the functions
        main();
        greet();
        //Math.max(3,4)
        System.out.printf(greet_with_hello()); // no argument but return type
        greet_with_name("Rahul"); // With argument and no return type
        System.out.println(greet_with_name_and_age("Rahul", 25)); // With argument and return type


    }

    // Step 1 - Declaration / Define
    static void main(){
        System.out.println("Hi, another Look like of main");
    }


    // Without Parameters and Without Return Type.
    // no argument and no return type
    static void greet(){
        System.out.println("Hi, How are you?");

    }

    // Without Parameters but With Return Type
    // no argument but return type
    static String greet_with_hello(){
        return "Hi, How are you, example 2";
    }

    // With Parameters and Without Return Type.
    // With argument and no return type
    static void greet_with_name(String name){
        System.out.println("Hi, Your name is " + name);
    }

    // With Parameters and With Return Type.
    // With argument and return type
    static String greet_with_name_and_age(String name, int age){
        return "Hi, Your name is " + name + " and your age is " + age;
    }

}
