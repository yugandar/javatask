class Parent
{
    void show() {
       System.out.println("Parent's show()"); }
}

// Inherited class
class Child extends Parent
{
    // This method overrides show() of Parent
    @Override
    void show() {
      System.out.println("Child's show()"); }
  }

// Driver class
class Main
{
    public static void main(String[] args)
    {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Parent p1 = new Parent();
        p1.show();

        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        Child p2 = new Child();
        p2.show();
    }
}
