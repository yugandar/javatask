class Booker{
  int pages;
  void initialize(int pages){
   pages=pages;
    //this.pages=pages;
    //pages=p;
  }
  void display(){
    System.out.println(pages);

  }
}
class books2{
  public static void main(String...args){
    Booker q1= new Booker();
    q1.pages=120;
    q1.display();
  }
}
