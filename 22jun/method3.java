class p{
   int i;
   void display(){
     System.out.println(i);
   }
 }
class method3{
  public static void main(String...args){
            p p1=new p();
            p1.i=10;
            p p2=new p();
            p2.i=20;
            p1.display();
            p2.display();
  }
}
