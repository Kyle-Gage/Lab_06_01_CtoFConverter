import java.util.Scanner;

    public class CtoF
    {

        public static void main(String[] args)
        {
            // Convert C to F
            Scanner in = new Scanner(System.in);
            double cels = 0;
            double fahren = 0;
            String trash;
            Boolean inputCorrect = false;


            do
            {
                System.out.print("Enter a temperature in Celsius: ");

                if (in.hasNextDouble())
                {
                    cels = in.nextDouble();
                    in.nextLine();
                    fahren = (cels * 1.8) + 32;
                    System.out.println("\n The temperature in Fahrenheit is " + fahren);
                    inputCorrect = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("\n You must enter a valid double and not " + trash);
                }
            }while(!inputCorrect);

        }
    }

