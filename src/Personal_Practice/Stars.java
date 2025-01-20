package Personal_Practice;

public class Stars {
    public static void main(String[] args)
    {
        int row, StarsNo;

        for(row = 1; row <= 10; row++)
        {
            for (StarsNo = 1; StarsNo<=row; StarsNo ++)
            {
                System.out.print("*");
            }


            System.out.println(); // go to next line
        }
    }

}

