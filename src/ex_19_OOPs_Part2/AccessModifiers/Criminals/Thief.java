package ex_19_OOPs_Part2.AccessModifiers.Criminals;

import ex_19_OOPs_Part2.AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief1 = new Cop(100);
        //thief1.canIShoot(); - can't access
    }
}
