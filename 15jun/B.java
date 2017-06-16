class B{
  public static void main(String...args){
  {
    int i=m1();
    System.out.println("i="+i);
    m1();
    int j=m1()+20;
    System.out.println("j="+j);
    System.out.println(m1());
  }
  static int m1()
  {
    System.out.println("m1 strats");
    return 10;
  }
  }
}
}
