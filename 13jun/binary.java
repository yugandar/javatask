import java.util.Scanner;
class binary{
  public static void main(String...args){

    int i=0;
    int d=0;
    int b=1010;

    while(b>0)
      {
      int a= b%10;
      d=a* Math.Pow(2,i);
    i++;
    b/=10;
     }
      System.out.println(d);
    }
  }
