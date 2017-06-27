class Book{
  int pages;
  void initialize(int pages){
    pages=pages;
    //this.pages=pages;
  }
  void display(){
    System.out.println(pages);

  }
}
class books{
  public static void main(String...args){
    Book q1= new Book();
    q1.pages=120;
    q1.display();
  }
}
