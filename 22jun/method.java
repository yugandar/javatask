class A{
static int i;
int j;
}
class method{
  public static void main(String...args){

    A b1 = new A();
    b1.i=10;
    A b2 = new A();
    b2.i=20;

      System.out.println(b1.i);
        System.out.println(b2.i);

  }
}
