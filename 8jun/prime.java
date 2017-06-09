import java.util.Scanner;
class prime{
  public static void main(String...args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = s.nextInt();
    int a = 1;
    for(int i=2;i<n/2;i++){
      if(n%i==0)
       a=0;
       System.out.println("not a prime number");
       break;

    }
    if(a==1)
    System.out.println("Prime");
  }
}
