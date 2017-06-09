import java.util.Scanner;
class sumofn{
  public static void main(String...args){
    int sum = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number");
    int n = s.nextInt();
    for(int i=1;i<=n;i++){
      sum =sum+i;
         System.out.println(sum);
    }

  }
}
