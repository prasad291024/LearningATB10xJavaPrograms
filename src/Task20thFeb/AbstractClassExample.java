package Task20thFeb;

public class AbstractClassExample {
    public static void main(String[] args) {
        MyCat kitty = new MyCat();
        kitty.makeSounds();
        kitty.sleeping();
    }
}

abstract class Animals {
    abstract void makeSounds();

    void sleeping() {
        System.out.println("Kitty is Sleeping...");
    }
}

class MyCat extends Animals {
    void makeSounds() {
        System.out.println("Kitty calling Meow");
    }
}

