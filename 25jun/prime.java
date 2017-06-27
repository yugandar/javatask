import java.util.Scanner;
public class prime {
// prime numbers 1 to 100
       public static void main(String...args) {
               System.out.println("Enter the numbers to print");
               Scanner s = new Scanner(System.in);
               int limit=s.nextInt();   // geting the limit
               System.out.println("Prime numbers between 1 and " + limit);

               for(int i=1; i < limit; i++){  //

                       boolean isPrime = true;


                       for(int j=2; j < i ; j++){
3
                               if(i % j == 0){         
                                       isPrime = false;
                                       break;
                               }
                       }
                       if(isPrime)
                               System.out.print(i + " ");
               }
       }
}
