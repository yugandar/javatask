import java.util.Scanner;
class star2{
  public static void main(String...args){
    Scanner s = new Scanner(System.in);
    System.out.print("enter the number");
    int n = s.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
      System.out.print(i+" ");
    }
    System.out.println();
  }
}

}
