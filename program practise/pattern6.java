import java.util.Scanner;
class pattern6
{
public static void main(String[] args)
{
  Scanner s = new Scanner(System.in);
  System.out.println("enter the number");
  int n =s.nextInt();
for(int i=n; i>=1; i--)
{
for(int j=n; j>=i; j--)
{
System.out.print(" ");
}
for(int k=1; k<(i*2); k++)
{
System.out.print("*");
}
System.out.println();
}
}
}
