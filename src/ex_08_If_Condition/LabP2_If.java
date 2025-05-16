package ex_08_If_Condition;

public class LabP2_If {
        public static void main(String[] args) {
            int age = Integer.parseInt(args[0]); // convert string input to integer

            if( age >= 18){
                System.out.println("You are allowed to vote!");
            }
            else{
                System.out.println("You are not allowed to vote!");
            }
    }
}
