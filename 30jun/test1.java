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
  car c;
  Driver(String n){
    name=n;
    c=new car();
    System.out.println("driver"+name+"is selected");
  }
  void drive(){
    c.start();
    c.accesler();
    c.brake();
  }
}

  class test1{
    public static void main(String...args){
      Driver d1=new Driver("ramu");
      d1.drive();
    }
  }
