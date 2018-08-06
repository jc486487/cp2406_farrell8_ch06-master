public class CountByThrees
{
    public static void main(String args[])
    {
        int i;
        for (i= 3; i<=300; i++)
        {
            System.out.print(i + " ");
            if (i%30 == 0)
            {
                System.out.println();
            }
            i += 2;
        }
    }
}
