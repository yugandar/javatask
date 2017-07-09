class person{
  String name;
  person( String n){
    name = n;
    System.out.println("name of the teacher"+n);
  }
}
class teacher extends person{
  String subject;
  teacher(String n,String s){
    super(n);
    subject=s;
    System.out.println("the subject"+s);
  }
  }
class human{
  public static void main(String...args){
    new teacher("JAYANTHI","OS");
  }
}
