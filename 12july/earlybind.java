class A{
  void m1(){
    int i=1;
   System.out.println("A class");
  }
}
class B extends A{
  void m1(){
    int i=2;
  System.out.println("B class");
  }
}
class c extends A{
  void m1(){
    int i=3;
  System.out.println("c class");
  }
}

class earlybind{
  public static void main(String[] args) {
    A a1 = new B();
    System.out.print(a1.i);
  //  a1=new(c);
    System.out.println(a1.i);
  }
}
