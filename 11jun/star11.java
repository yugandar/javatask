import java.util.Scanner;
class star11{
  public static void main(String...args){
    int t=1;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = s.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){


        System.out.print(t+" ");
        t=t+1;
          }
          System.out.println();
         }
           



  }
}
