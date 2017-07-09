import java.util.Scanner;
class table{
public static void main(String...args){
  Scanner s = new Scanner(System.in);
  System.out.println("enter the table");
  int n = s.nextInt();
  System.out.println("enter upto");
  int j = s.nextInt();
   for(int i=1;i<=j;i++){
     int c = i*n;
     System.out.println(i+"*"+n+"="+c);
   }
}
}
