class D{
  D(int i){
System.out.println("value "+i);
  }
}
class E extends D {
E(){
  super(10);// important super keyword most
}
}
class test{
  public static void main(String...args){
    new E();

  }
}
