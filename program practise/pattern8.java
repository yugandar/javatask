import java.util.Scanner;
class pattern8
{
public static void main(String[] args)
{
  Scanner s = new Scanner(System.in);
  System.out.println("enter the number");
  int n =s.nextInt();
for(int i=n; i>=0; i--)
{
for( int j=1; j<=i; j++)
{
  if((i+j)%2==0){
System.out.print("1");
}else{
  System.out.print("0");
}
}
System.out.println();
}
}
}
