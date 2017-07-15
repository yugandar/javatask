class x{
  int i=1;

}
class y extends x{
  int i=2;
  void m1(){
    System.out.println(i);
    System.out.println(super.i);
  }
}
class test4{
  public  static void main(String...args){
    y y1 = new y();
    y1.m1();


  }
}
