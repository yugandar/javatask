class phone{
  int height,width,length;
  phone(int h,int w,int l){
    height=h;
    width=w;
    length=l;
  }
  void  display(){
    System.out.println("Height ="+height);
    System.out.println("width ="+width);
    System.out.println("length ="+length);
  }
}
class  smartphone extends phone {
  int pixels;
  smartphone(int h,int w,int l,int p){
    super(h,w,l);
    pixels=p;
  }
 void  display(){
   super.display();
   System.out.println("pixel="+pixels);
 }
}
class   phonesuper{
  public static void main(String...args){
    smartphone s  = new smartphone(10,10,10,10);
    s.display();
  }

}
