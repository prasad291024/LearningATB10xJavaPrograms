// Method Overriding Example
package Personal_Practice;

// Parent class
public class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

// SBI subclass
class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

// ICICI subclass
class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

// AXIS subclass
class AXIS extends Bank {
    int getRateOfInterest() {
        return 6;
    }
}

// Main class
class Test2 {
    public static void main(String args[]) {
        Bank b = new Bank();
        System.out.println("Bank Rate of Interest: " + b.getRateOfInterest());

        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}
