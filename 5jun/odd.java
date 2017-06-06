import java.util.Scanner;
class odd{
  public static void main(String...args){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int n = s.nextInt();
    if(n%2==0)
    {
      System.out.println("even");

    }else{
      System.out.println("odd");
    }
  }
}
