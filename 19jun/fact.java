
import java.util.Scanner;
public class fact{
    static int factorial(int n){
          if (n == 1)
            return 1;
          else
            return(n * factorial(n-1));
    }

public static void main(String[] args) {
System.out.println("enter the number");
Scanner s= new Scanner(System.in);
int n=s.nextInt();

System.out.println("Factorial of number is: "+factorial(n));

}
}
