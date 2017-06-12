import java.io.*;

// Java code to demonstrate star pattern
public class star1
{
    // Function to demonstrate printing pattern
    public static void printNums(int n)
    {
        // initialising starting number
        int i, j, num=1;

        // outer loop to handle number of rows
        // n in this case
        for(i=0; i<n; i++)
        {

            // without re assigning num
            // num = 1;
            for(j=0; j<=i; j++)
            {
                // printing num with a space
                System.out.print(num+ " ");

                // incrementing num at each columncd
                num = num + 1;
            }

            // ending line after each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 4;
        printNums(n);
    }
}
