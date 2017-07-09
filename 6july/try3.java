class book{
  void pages(){
    System.out.println("display pages");
  }
  void author(){
    System.out.println("display author");
  }
}
class lib extends book{
  void pages(){
    System.out.println("display pages  100");
  }
}
class issue extends lib{
  void author(){
      System.out.println("display author name yugandar");
  }
}
class try3{
  public static void main(String...args){
  book b1 = new book();
  b1.pages();
  b1.author();
  issue is = new issue();
  is.pages();
  is.author();
  }

}
