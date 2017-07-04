class  box{
  int height;
  int width;
  int length;

box(){

}
box(int h,int w,int l){
  height=h;
  width=w;
  length=l;
  System.out.println("box values");
}
box(int d){
  this(d,d,d);
  System.out.println("box dimension");
}
box(box b){
  this(b.height,b.length,b.width);
    System.out.println("box dimension");
}
}
class test{
  public static void main(String...args){
    new box(10,5,8);
    new box(10);

  }
}
