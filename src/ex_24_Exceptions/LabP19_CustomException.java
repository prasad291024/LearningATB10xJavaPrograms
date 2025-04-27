package ex_24_Exceptions;


public class LabP19_CustomException {
    public static void main(String[] args) {
        LabP18_Bank sbi = new LabP18_Bank("INR",100);
        LabP18_Bank icici = new LabP18_Bank("INR",123);
        LabP18_Bank jp_chase = new LabP18_Bank("USD",101);
//        int result = sbi.add(icici);;
        int result = sbi.add(jp_chase);;
        System.out.println(result);

    }
}