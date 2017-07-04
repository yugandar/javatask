class block1{
  static{
    System.out.println("satic block ");
  }
  {
    System.out.println("non static block");
  }
  block1(){
   System.out.println("constructor");
  }
  public static void main(String...args){
    new block1();
    new block1();
  }
}
