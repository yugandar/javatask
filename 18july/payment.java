import java.util.Scanner;
 interface PaymentStrategy
{
  public void pay(String amount);

}
 class DebitCardPaymentStrategy implements PaymentStrategy
{

  public void pay(String amount)
  {
    System.out.println("Customer pays the money " +amount+ "Rs. using Debit Card");
  }

}
class CreditCardPaymentStrategy implements PaymentStrategy
{

  public void pay( String amount )
  {
    System.out.println("Customer pays the money " + amount + "Rs. using Credit Card");
  }

}
 class ByCashPaymentStrategy implements PaymentStrategy
{

  public void pay( String amount )
  {
    System.out.println("Customer pays the money " + amount + "Rs. as a Cash");
  }

}
 class PaymentContext
{
 private PaymentStrategy paymentStrategy;

 // Client will set what PaymentStrategy to use by calling this method
 public void setPaymentStrategy(PaymentStrategy strategy)
 {
  this.paymentStrategy = strategy;
 }

 public PaymentStrategy getPaymentStrategy()
 {
  return paymentStrategy;
 }

 public void pay(String amount)
 {
  paymentStrategy.pay(amount);
 }

}


 class payment
{

  public static void main( String[] args )
  {

    System.out.println("Please enter Payment Type : 'CreditCard' or 'DebitCard' or 'ByCash'");
    Scanner scanner = new Scanner(System.in);
    String paymentType = scanner.next();
    System.out.println("Payment type is : " + paymentType);

    System.out.println("\nPlease enter Amount to Pay : ");
    Scanner scanner1 = new Scanner(System.in);
    String amount = scanner1.next();
    System.out.println("amount is : " + amount);

    PaymentContext ctx = null;
    ctx = new PaymentContext();

    if( "CreditCard".equalsIgnoreCase(paymentType) )
    {
      ctx.setPaymentStrategy(new CreditCardPaymentStrategy());
    }
    else if( "DebitCard".equalsIgnoreCase(paymentType) )
    {
      ctx.setPaymentStrategy(new DebitCardPaymentStrategy());
    }
    else if( "ByCash".equalsIgnoreCase(paymentType) )
    {
      ctx.setPaymentStrategy(new ByCashPaymentStrategy());
    }

    System.out.println("PaymentContext has :"+ctx.getPaymentStrategy());

    ctx.pay(amount);

  }
}
