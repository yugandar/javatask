import java.util.Scanner;
class fib{
  public static void main(String...args){
    int  n1=0,n2=1,n3;

    Scanner s = new Scanner(System.in);
    System.out.println("enter the number");
    int count = s.nextInt();
    System.out.println( n1+" "+n2);
    for(int i=2;i<count;i++){
      n3=n2+n1;
      n1=n2;
      n2=n3;

         System.out.println( ""+n3);
    }

  }
}
