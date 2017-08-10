import java.util.Scanner;
class pattern3{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number");
    int n = s.nextInt();
    for(int i=0;i<=n;i++){
      for(int j=0;j<=n;j++){
        if(i==0||i==5||j==0||j==5){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
