import java.util.Scanner;

class facto{
static int fact(int n){
  if(n==0)
  return 1;
  else
  return n*fact(n-1);
}

public static void main(String...args){
  Scanner s = new Scanner(System.in);
  System.out.println("enter the number");
  int n = s.nextInt();
  System.out.println("the factorial number="+fact(n));
}
}
