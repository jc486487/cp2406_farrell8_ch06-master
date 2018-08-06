import java.util.Scanner;

public class CountByAnything
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to count by: ");
        int count = sc.nextInt();

        int i, pos=0;
        for (i= 3; i<=300; i++)
        {
            System.out.print(i + " ");
            pos += 1;
            if (pos%10 == 0)
            {
                System.out.println();
            }
            i += (count-1);
        }
    }
}
