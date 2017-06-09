import java.util.Scanner;

public class JavaProgram
{
   public static void main(String args[])
   {
       String s, sN;
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter a String : ");
       s = scan.nextLine();

       System.out.print("Removing Vowels from The String [" +s+ "]\n");
       sN = s.replaceAll("[aeiouAEIOU]", "");

       System.out.print("All Vowels Removed Successfully..!!\nNow the String is :\n");

       System.out.print(sN);
   }
}
