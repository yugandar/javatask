import java.util.Scanner;
class PatternE
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter a number");
int n=scn.nextInt();

for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if((i==0 &&(j>0 && j<n/2))|| (j==0 && (i>0&&i<n-1))||(i==n/2 && j<n/2)||i==n-1&&(j>0 &&j<n/2))
{
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
