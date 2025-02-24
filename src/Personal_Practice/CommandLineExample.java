package Personal_Practice;

public class CommandLineExample {
    public static void main(String[] args) {
        if(args.length > 0)
        {
            String ip = args[0];
            System.out.println("String Input: " +ip);

            try
            {
                int a = Integer.parseInt(ip);
                System.out.println("Converted Integer Input: " +a);
            } catch (NumberFormatException e)
            {
                System.out.println("NumberFormatException: Invalid input format");
            }

        }
        else
        {
            System.out.println("No command line arguments provided");
        }
    }
}
