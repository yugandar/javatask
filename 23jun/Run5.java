class G{
int i;

  void display(){
  int i=1;
   System.out.println(this.i);
  }
}
class Run5{
  public static void main(String...args){
    G g1= new G();
    g1.i=10;
    G g2=new G();
    g2.i=20;
    g1.display();
    g2.display();
  }
}
