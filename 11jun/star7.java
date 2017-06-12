import java.util.Scanner;

public class star7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("How many rows you want in this pattern?");

        int n = sc.nextInt();


        for (int i =n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        //Closing the resources

          }
}
