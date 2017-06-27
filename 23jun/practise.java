class A{
  static int i;
  int j;
  void increment()
  {
    i++;
    ++j;
    }
    void display(){
      System.out.println(i);
      System.out.println(j);
    }
}
class practise{
  public static void main(String...args){
         A f1= new A();
         A f2= new A();
         A f3= new A();
         f1.increment();
         f2.increment();
         f3.increment();
         f1.display();
         f2.display();
         f3.display();
        // System.out.println(f1);
         //System.out.println(f2);
         //System.out.println(f3);
     }

}
