import java.util.Scanner;
class person{
  String name;
  char gender;
  static int count;
       person(String n,char g){
         name=n;
         gender=g;
         //count++;
       }

void dispaly(){
  System.out.println("name:"+name);
  System.out.println("gender:"+gender);

}
}

class man1{
  public static void main(String...args){
    int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter how many persons");
        int i=nextInt(System.in);
        for(i=0;i<n;i++){
          System.out.println("enter your name");
          System.out.println("enter your gender");
        String  n=nextString();
        char  g=nextChar();
        }
        person  p1=new person(n);
        person  p2=new person(g);
        p1.dispaly();
        p2.dispaly();
        //cSystem.out.println("counts"+person.count);

  }

}
