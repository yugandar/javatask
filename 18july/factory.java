import java.util.Scanner;
interface payable {

  void pay();

}
class Debitcard implements payable{
  public void pay(){
    System.out.println("paid using debit card");
    System.out.print("payment started");
  }
}
class Creditcard implements payable{
  public void pay(){
    System.out.println("paid using credit card");
    System.out.print("payment started");
  }
}
class wallet implements payable{
  public void pay(){
    System.out.println("paid using  wallet");
    System.out.print("payment started");
  }
}
class Factory{
  public static payable getobject();
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your payment type");
    String str = s.next();

    Factory ctx = null;
    ctx = new Factory();

    if(str.equals("Debitcard")){
    return new Debitcard();
}
    if(str.equals("Creditcard")){
    return new Creditcard();
}
    if(str.equals("wallet")){
    return new wallet();
}
    System.out.println("invaid option");
    return  null;
  }
}
class factory{
  public static void main(String[] args) {
    {
      System.out.print("Welcome payment");
      payable p = new Factory.getobject();
      p.pay();
    }
  }
}
