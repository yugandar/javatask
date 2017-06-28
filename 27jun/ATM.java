import java.util.Scanner;
class Account{
  double bal;
  void getBalance(){
    System.out.println("current Balance"+bal+ "rs");
  }
  void withdraw(int amount){
    if(amount>bal)

      System.out.println("less balance");


    System.out.println(amount);
    bal-=amount;

  }
}

class ATM{
  public static void main(String...args){
    Account a =new Account();
    a.bal=3000;
    Scanner s = new Scanner(System.in);
    int n=0;
    do{
      System.out.println("1-View Balance 2-Withdarw");
      System.out.println("Enter your option");
      int option = s.nextInt();
      switch(option){
        case 2:
                  System.out.println("Enter your amount");
                  int amount =s.nextInt();
                  a.withdraw(amount);
        case 1:
                  a.getBalance();
                  break;
        default:
                  System.out.println("invalid");
          }
        System.out.println("1-continue 0-exit");
        n=s.nextInt();
      }  while (n==1);
        System.out.println("Thank You");

    }
  }
