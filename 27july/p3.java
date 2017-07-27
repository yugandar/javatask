

class Address
{
 String city;
 String state;
 Address(String city,String state)
 {
  this.city=city;
  this.state=state;
 }
void displayAddress(){
  System.out.println(city+""+state);
}
}
class Student
{
 String name;
 int rollno;
 Address auth;
 Student(String n,int r,Address at)
 {
  name=n;
  rollno=r;
  auth=at;
 }
 public void showDetail()
 {
  System.out.println("Name is"+name);
  System.out.println("rollno "+rollno);
   auth.displayAddress();
 }
}

class p3
{
 public static void main(String args[])
 {
  Address a =new Address("yugandar","TN");
  Student s=new Student("yugandar",84,a);
  s.showDetail();
 }
}
