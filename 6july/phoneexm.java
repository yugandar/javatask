class phone{
  void dial( long number){
  System.out.println("dialing number"+number+"using 2G phone");
  }
}
class smartphone{
  void dial( long number){
    System.out.println("dialing using "+number+"using 4G phone");
  }
}
class phoneexm{
  public static void main(String...args){
  smartphone s = new smartphone();
  s.dial(843833748);
}
}
