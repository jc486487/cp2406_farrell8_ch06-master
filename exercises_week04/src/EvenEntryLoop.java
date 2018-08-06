import java.util.Scanner;

public class EvenEntryLoop
{
        public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an \n\teven number \n\tor \n\t999 to stop the program");
        int num = sc.nextInt();

        while(num != 999)
        {
            if (num%2 == 0)
            {
                System.out.println("Good Job!");
                System.out.println("Enter an \n\teven number \n\tor \n\t999 to stop the program");
                num = sc.nextInt();
            }
            else
            {
                System.out.println("Invalid number. \nEnter an \n\teven number \n\tor \n\t999 to stop the program");
                num = sc.nextInt();
            }
        }
    }
}
