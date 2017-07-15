class book{
  String title="java";
}
class test{
  public static void main(String...args){
    final book b = new book();
    System.out.println(b.title);
    b.title=".NET";
    System.out.println(b.title);
  }
}
