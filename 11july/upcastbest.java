class A{
  void m1(){
    System.out.println("m1() of class A ");
  }
}
class B extends A{
  void m1(){
    System.out.println("m1() of class B");
  }
}

class C extends A{
  void m1(){
    System.out.println("m1() of class C");
  }
}
class upcastbest{
  public static void main(String[] args) {
    A a1 = new C();
    a1.m1();
    a1= new B();
    a1.m1();
  }

}
