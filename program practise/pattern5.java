import java.util.Scanner;
class pattern5
{
public static void main(String[] args)
{
  Scanner s = new Scanner(System.in);
  System.out.println("enter the number");
  int n =s.nextInt();
for(int i=1; i<=n; i++)
{
for(int j=n; j>=i; j--)
{
System.out.print(" ");
}
for(int k=1; k<=(2*i-1); k++)
{
System.out.print("*");
}
System.out.println("");
}
}
}
