import java.util.Scanner;
class reverse{
  public static void main(String...args){
    int temp=0;

    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = s.nextInt();
    int a = n;
    while(n>0)
      {
      temp = (temp*10)+(n%10);
      n/=10;
     }
      System.out.println(temp);
    }

  }
