class car{

}
class Audi extends car{

}
class Benz extends car{

}
class driver{
  void drive(car c){
    System.out.println("executing drive()");
  }
}
class cartest {
 public static void main(String[] args) {
   driver d = new driver();
   d.drive(new Audi());
   d.drive(new Benz());

  }

}
