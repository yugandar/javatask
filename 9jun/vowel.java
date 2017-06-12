import java.util.Scanner;
class vowel{
  public static void main(String...args){

    String s,sn;
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the String");
    s=scn.nextLine();
    sn=s.replaceAll("[aeiouAEIOU]"," ");
    System.out.println("Given String" +" "+s);
    System.out.println("Removed String"+" "+sn);
  }
}
