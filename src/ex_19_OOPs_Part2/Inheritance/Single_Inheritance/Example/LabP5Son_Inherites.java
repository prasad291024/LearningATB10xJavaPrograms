package ex_19_OOPs_Part2.Inheritance.Single_Inheritance.Example;

public class LabP5Son_Inherites extends LabP3_Father {
    public static void main(String[] args) {
        LabP5Son_Inherites son = new LabP5Son_Inherites();
        son.bhk_2();
        System.out.println("Father's Gold: " + son.gold_f);

        LabP5Son_Inherites son2 = new LabP5Son_Inherites();
        //son2.bhk_3(); // can't use as it belongs to son
        son2.bhk_2();
        System.out.println("Father's Gold: " + son2.gold_f);

    }


}
