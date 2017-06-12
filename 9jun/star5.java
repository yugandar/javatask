import java.util.Scanner;
class star5{
  public static void main(String...args){
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number");
    int n = s.nextInt();
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5;j++){
        if((i==1||i==5||j==1||j==5)){
        System.out.print("*");
      }
      else{
         System.out.print(" ");
      }

    }
   System.out.println(" ");
}
  }
}
