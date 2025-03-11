package Personal_Practice;

class Animal{
    void makesound()
    {
        System.out.println("Animal makes sound");
    }

}
class Dog extends Animal{
    void makesound(){
        System.out.println("Dog barks");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
    Animal a = new Animal();
    a.makesound();// Animal makes sound

        Dog d = new Dog();
        d.makesound(); //


        Animal ref = new Dog();
    ref.makesound(); // overridden method Dog barks
  }
}