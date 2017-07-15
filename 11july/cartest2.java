class car{
void start(){

}
}
class Audi extends car{
  void sunroof(){

  }

}
class Benz extends car{
  void gps(){

  }

}

class cartest2 {
 public static void main(String[] args) {
   car c new Benz();
   c.start();
//   c.gps();
  // c.sunroof();
  }

}
