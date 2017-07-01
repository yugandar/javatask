/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class car{
      int regNum;
      private static int num=2000;
      car(){
        regNum=num++;
        System.out.println("car number "+regNum);
      }

      void start(){
        System.out.println(+regNum+"car started");
      }
      void accesler(){
        System.out.println(+regNum+"car moving");

      }
      void brake(){
          System.out.println(+regNum+"car stops");
      }
}
class Driver{
  String name;
  Driver(String n){
    name=n;
    System.out.println("driver"+name+"is selected");
  }
  void drive(car c){
    c.start();
    c.accesler();
    c.brake();
  }
}

class owner{
  public static void main(String...args){
                  car c1 = new car();
                    car c2 = new car();
                    car c3 = new car();
                    Driver drive = new Driver("MADHU");
                    c1.drive();
                    c2.start();
                    c3.start();
                    c1.accesler();
                    c2.accesler();
                    c3.brake();




}
