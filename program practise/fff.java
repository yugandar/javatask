import java.util.Scanner;
class fff{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("enter the number");
      int n = s.nextInt();
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if((j==0 && (i>0 && i<n-1))||((i==0||i==n-1)||(i==n/2&&j<n/2))){//||(j==n/2&&(i!=0&&i!=n-1))){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  }
