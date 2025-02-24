package Personal_Practice;

public class RunnerClass {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println(car1.price);


        Car nano = new Car();
        nano.name = "Nano";
        nano.model = "Hatchback";
        nano.year = 2000;
        nano.color = "Red";
        nano.price = 100000;
        System.out.println(nano.name);
        System.out.println(nano.model);
        System.out.println(nano.year);
        System.out.println(nano.color);
        System.out.println(nano.price);
    }
}
