import java.util.Scanner;
class pattern7
{
public static void main(String[] args)
{
  Scanner s = new Scanner(System.in);
  System.out.println("enter the number");
  int n =s.nextInt();
  int a=0,m;
for(int i=n; i>=0; i--)
{
for(int j=0; j<i; j++)
{
  m=1+a++;

System.out.print(m+" ");
}
System.out.println("");
}
}
}
