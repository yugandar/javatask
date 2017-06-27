import java.util.Scanner;
class primech{
  public static void main(String...args){
  int temp=0;
    System.out.println("Enter the number");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m=n/2;
    for(int i=2;i<=m;i++){
    if(n%i==0){
      System.out.println("not a Prime");
    temp=1;
      break;

    }
  }

    if(temp==0)
      System.out.println(" prime number");

    }

}
