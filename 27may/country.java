Class countries
{
   public void methodA()
   {
     String s="us"
     System.out.println("s");
   }
}

Class permittedcountries extends countries
{
   public void methodB()
   {
     String p ="us" "india"
     System.out.println("p");
   }
   public static void main(String args[])
   {
     permittedcountries obj = new permittedcountries();
     obj.methodA(); //calling super class method
     obj.methodB(); //calling local method
  }
}
