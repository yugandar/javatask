class book{
  book(){
    System.out.println("the book is best");

  }
  book(int i){
    this();
    System.out.println("Use the book");
    System.out.println("best book");
  }
  class library{
    public static void main(String...args){
      new book(10);
    }
  }
}
