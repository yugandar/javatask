import java.util.Scanner;
class prime2{
  public static void main(String...args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = s.nextInt();
    for(int i=1;i<n/2;i++){
      System.out.println("not a prime");
      return;
    }

   System.out.println("prime");
  }
}
