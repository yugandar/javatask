import java.util.Scanner;
class fibo{
  public static void main(String...args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = s.nextInt();
    int n1=0,n2=1,n3;
    System.out.print(n1+" "+n2);
    for(int i=2;i<=n;i++){
      n3=n1+n2;
      n1=n2;
      n2=n3;
        System.out.print(" "+n3);
    }

  }
}
