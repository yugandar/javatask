import java.util.Scanner;

public class fib {
    static int n1=0,n2=1,n3=0;
     static void printFibo(int n){
        if(n>0){
             n3 = n1 + n2;
             n1 = n2;
             n2 = n3;
             System.out.print(" "+n3);
            printFibo(n-1);
         }
     }

public static void main(String[] args) {
  System.out.println("enter the number");
  Scanner s= new Scanner(System.in);
  int n =s.nextInt();
      System.out.print(n1+" "+n2);//printing 0 and 1
      printFibo(n-2);//n-2 because 2 numbers are already printed
}
}
