import java.util.Scanner;
class adding{
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    System.out.println("Enter the String1");
    String s1 =s.nextLine();
    char[] c =s1.toCharArray();
    int sum=0;
    String txt="";
    String text="";
    for(int i=0;i<s1.length();i++){
      {
        if(s1.charAt(i)!=' ')
      }
      if(s1.charAt(i)>=48&&s1.charAt(i)<=57){
        sum=sum+Integer.parseInt(text+s1.charAt(i));

      }
      else if(s1.charAt(i)>=65&&s1.charAt(i)<=122)
      txt=txt+(char)s1.charAt(i);

    }
    else{
      System.out.print(sum+""+txt+"");
      sum=0;
      txt="";

    }
  }
  System.out.print(sum+""+txt+" ");
}
}
