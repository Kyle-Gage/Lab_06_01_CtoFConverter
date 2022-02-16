import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// Convert C to F
        Scanner in = new Scanner(System.in);
        double cels;
        double fahren;
        String trash;


            System.out.print("Enter a temperature in Celsius: ");

            if (in.hasNextDouble())
            {
                cels =in.nextDouble();
                in.nextLine();
                fahren = (cels * 1.8) + 32;
                System.out.println("\n The temperature in Fahrenheit is " + fahren);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\n You must enter a valid double and not " + trash);
                System.out.println("Exiting Program... Please run again!");
                System.exit(0);
            }
    }
}
