package ex_19_OOPs_Part2.AccessModifiers.Police;

public class Cop {
    public int gun; // public access modifier
    String idCard;


    public Cop(int gun) {
        this.gun = gun;
    }

    void canIShoot() {
        System.out.println("Of course, You can Shoot!");
    }



}