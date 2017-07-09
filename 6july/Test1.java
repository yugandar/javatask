class Book{
    String title;
    String author;
    int pages;
    Book(String t,String a,int p){
         t=title;
         a=author;
         p=pages;
    }

void getDetails(){
    System.out.println(title+""+author+""+pages);
}
class Test1 extends Book{
    public static void main(String...args){
    Book b = new Book("operating System","balaji",100);
        b.getDetails();
    }
}
}
