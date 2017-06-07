import java.util.Scanner;
class marriage{
  public static void main(String...args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the age");
    int age = s.nextInt();
    if(age>=21&& age<=35)
    System.out.println("is elligble");
    else{
      System.out.println("not elligble");
    }
  }
}
