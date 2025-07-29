package Personal_Practice;

public class Dog1 {

    String name;
    int age;
    String color;
    String breed;


    void bark()
    {
        System.out.println(name +" is barking");

    }

    public static void jump()
    {
        System.out.println("Dog1 is jumping");
    }

    public static void main(String[] args) {



        Dog1 d1 = new Dog1();
        d1.name = "Bruno";
        d1.age = 2;
        d1.color = "brown";
        d1.breed = "German Shepard";
        System.out.println( d1.name + " is " + d1.age + " Years old "+ d1.breed + " dog having color as " + d1.color ) ;
        d1.bark();
        Dog1.jump();

    }





}
