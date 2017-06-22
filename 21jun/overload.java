class overload {
  public static void main(String...args){
    m1();
    m1(20);
    m1(10+50);
    m1(10.23);s

  }

  static void m1(){
    System.out.println("Hello");
  }
  static void m1(int i){
    System.out.println("World");
  }
  static void m1(double d){
    System.out.println("Welcome");
  }
}
