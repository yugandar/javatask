import java.util.Scanner;

public class star5
{
    public static void main(String args[])
    {
        int i,j, k=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
      int   n = scan.nextInt();
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=(n-i); j++)
            {
                System.out.print("  ");
            }
            while(k != (2*i-1))
            {
                System.out.print("*");
                k++;
            }
            k = 0;
            System.out.println();
        }
    }
}
