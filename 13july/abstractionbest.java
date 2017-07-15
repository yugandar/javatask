abstract class car{
  abstract void start();
  abstract void acccerlate();
  abstract void brake();
}
class Audi extends car{
  void start(){
  System.out.println("Audi started");
  }
  void acccerlate(){
  System.out.println("Audi moving");
  }
  void brake(){
  System.out.println("Audi Stop");
  }
}
class Ford extends car{
  void start(){
  System.out.println("Ford started");
  }
  void acccerlate(){
  System.out.println("Ford moving");
  }
  void brake(){
  System.out.println("Ford stoped");
  }
}
class driver{
  void drive(car c){
    c.start();
    c.acccerlate();
    c.brake();
  }
}

class abstractionbest{
  public static void main(String[] args) {
    driver d = new driver();
    d.drive(new Audi());
    d.drive(new Ford());
    d.drive(new Benz());
  }
}


class Benz extends car{
  void start(){
  System.out.println("Benz started");
  }
  void acccerlate(){
  System.out.println("Benz moving");
  }
  void brake(){
  System.out.println("Benz stoped");
  }
}
