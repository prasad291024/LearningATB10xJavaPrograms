package Personal_Practice;

public class LargestNo {
    public static void main(String[] args) {
        int array[] = {34, 64, 212, 67, 33, 765, 98};
        int max = array[0];
        for(int i =0; i <array.length; i ++){
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        System.out.println( "Maximum number : " + max);
    }
}
