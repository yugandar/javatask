class pho{
  void dial( long number){
  System.out.println("dialing number"+number+"using 2G phone");
  }
}
class smartphone{
  void dial( long number){
    System.out.println("dialing using "+number+"using 4G phone");
  }
}
class satellightphone{
  void dial(long number){
    System.out.println("dialing using "+number+"using satellightphone phone");
  }
}


class phone extends satellightphone{
  public static void main(String...args){
  satellightphone s = new satellightphone();
  s.dial(843833748);
}
}
