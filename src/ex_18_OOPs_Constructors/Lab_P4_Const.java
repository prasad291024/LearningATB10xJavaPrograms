package ex_18_OOPs_Constructors;

import java.util.Scanner;

public class Lab_P4_Const {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model Name for Tesla");
        String model_name = sc.next();
        Car2 tesla = new Car2(model_name,2025);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        System.out.println(" ---> ");


        System.out.println("Enter the model Name for Nano");
        String model_name2 = sc.next();
        Car2 nano = new Car2(model_name2,2014);
        System.out.println(nano.model);
        System.out.println(nano.year);

        System.out.println(" ---> ");
        System.out.println("Enter the model Name for Audi");
        String model_name3 = sc.next();
        Car2 audi = new Car2();
        System.out.println(audi.model);
        System.out.println(audi.year);
        System.out.println(" ---> ");



    }
}