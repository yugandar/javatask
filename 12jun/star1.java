import java.util.Scanner;
public class star1
{
    public static void main(String args[])
    {
        int n, i, j, s= 1;
        System.out.print("Enter the number of rows: ");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        s= n - 1;
        for (j = 1; j <= n; j++)
        {
            for (i = 1; i <= s; i++)
            {
                System.out.print(" ");
            }
            s--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        s= 1;
        for (j = 1; j <= n - 1; j++)
        {
            for (i = 1; i <= s; i++)
            {
                System.out.print(" ");
            }
            s++;
            for (i = 1; i <= 2 * (n - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
