package ex_20_OOPs_Super_Abstraction;

public class LabP3_Private {
}

class XYZ{

        XYZ(){

    }
    protected int my_gold = 10;
}

class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);
    }
}