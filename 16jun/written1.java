class written1{
static  int m1 (int a)
  {
    return a++;
  }

  public static void main(String...args){
    int x=0;

    int y=0;
    y= m1(x++);
    System.out.println(x);
    System.out.println(y);

}
}
