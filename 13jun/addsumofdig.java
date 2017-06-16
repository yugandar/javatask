import java.util.Scanner;
class addsumofdig{
  public static void main(String...args){
    int sum =0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = s.nextInt();
    while(n>0)
      {
        sum+=n%10;
        n/=10;
      }
      System.out.println(sum);

  }
}
