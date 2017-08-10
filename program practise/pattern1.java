import java.util.Scanner;
class pattern1{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number");
    int n = s.nextInt();
    for(int i=0;i<=n;i++){
      for(int j=0;j<=i;j++){
        System.out.print("*"+" ");
      }
      System.out.println();
    }
  }
}
