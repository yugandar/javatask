

class Student
{
 String Name;
 int rollno;
 String Address;
 Author(String name,int no,String place)
 {
  this.Name=name;
  this.rollno=no;
  this.Address=place;
 }
 public String getName()
 {
  return name;
 }
 public int getrollno()
 {
  return rollno;
 }
 public String getAddress()
 {
  return place;
 }
}

class Book
{
 String name;
 int price;
 Author auth;
 Book(String n,int p,Author at)
 {
  this.name=n;
  this.price=p;
  this.auth=at;
 }
 public void showDetail()
 {
  System.out.println("Book is"+name);
  System.out.println("price "+price);
  System.out.println("Author is "+auth.getName());
 }
}

class test
{
 public static void main(String args[])
 {
  Student s1=new Student("yuga",22,"India");
  Book b=new Book("Java",550,ath);
  b.showDetail();
 }
}
