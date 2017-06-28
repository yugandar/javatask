
 public class Person{
  String name;
  float height;
  float money;
  int age;
  boolean Gender;

  public Person( )
{
     this.height = height;
     this.money = money;
     this.age = age;
     this.Gender = Gender;
}

public float getHeight() {
    return height;
}

public void setHeight(float height) {
    this.height = height;
}

public float getMoney() {
    return money;
}





public class PersonExam{

     public static void main(String args[])
{
    Person person1= new Person();
    Person person2 = new Person();
   // add as many as you want perosn3 ,4 ..

    person1.setHeight(1);
    person1.setMoney(200);
    person1.Gender(false);
    person1.name(yugandar);



    System.out.println(person1.getHeight());
    System.out.println(person1.getMoney());
    System.out.println(person1.age);
    System.out.println(person1.Gender());
    System.out.println(yugandar);   // Notice the money is properly formatted

     //add your methods here
}
}
}
