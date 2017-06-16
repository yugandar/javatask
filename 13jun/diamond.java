import java.util.Scanner;
class diamond{
  public static void main(String...args){
    int i,j,k,spaces=4,star=1;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number");
    int n = s.nextInt();
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=spaces;j++){
        System.out.print(" ");

      }
      for(k=1;k<=star;k++){
        System.out.print("*");
      }
      System.out.println();

      if(i<=n/2){
        spaces--;
        star+=2;
      }else
      {
        spaces++;
        star-=2;
      }

    }



  }
}
