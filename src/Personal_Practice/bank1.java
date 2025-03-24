package Personal_Practice;

public class bank1 {
    public static void main(String args[]){
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