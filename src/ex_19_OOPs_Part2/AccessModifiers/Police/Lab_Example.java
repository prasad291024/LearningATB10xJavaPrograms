package ex_19_OOPs_Part2.AccessModifiers.Police;

public class Lab_Example {
    public static void main(String[] args) {
    Cop c1 = new Cop(10);
    int gun = c1.gun;
    String idCard = c1.idCard;
    c1.canIShoot();
    }
}
