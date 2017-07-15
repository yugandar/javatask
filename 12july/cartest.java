class  car{
  void start(){
   System.out.println("car start and move");
  }
  void accerlater(){
  System.out.println("move forward");
  }
  void brake(){
  System.out.println("applyed brake");
  }
}
class Audi extends car {
  void start(){
  System.out.println("Audi car start");

  }
  void accerlater(){
System.out.println("Audi accerlater");
  }
  void brake(){
System.out.println("Audi apply brake");
  }
}
class Benz extends car{
  void start(){
  System.out.println("benz started");
  }
  void accerlater(){
  System.out.println("Benz moved");
  }
  void brake(){
 System.out.println("benz apply brake");
  }
}
class driver{
  void driver(car c){
    c.start();
    c.accerlater();
    c.brake();
  }
}

class cartest{
  public static void main(String[] args) {
    car c = new Audi();
    c.start();
    c.accerlater();
    c.brake();
    car b = new Benz();
    b.start();
    b.accerlater();
    b.brake();

  }
}
