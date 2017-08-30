class A {
  public void display() {
    System.out.println("student A");
  }
}
class B extends A {

  public void display() {
    System.out.println("Student B");
  }
  public int add(int a, int b) {
    return a+b;
  }
  public double add(double a,double b) {
    return a+b;
  }
}
class oops{
  public static void main(String[] args) {
    A a=new A();
    a.display();
    B b=new B();
    b.display();
    System.out.println(b.add(5,2));
    System.out.println(b.add(5.,2.));
    a=b;
    a.display();
   }
}
