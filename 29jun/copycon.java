class rectangle{
        int length;
        int breadth;
        rectangle(){

        }
        rectangle(int l,int b){
          length=l;
          breadth=b;
        }
       rectangle(rectangle r){
         length=r.length;
          breadth=r.breadth;
        }
        void display(){
          System.out.println(+length+" "+breadth);
        }
}
class copycon{
  public static void main(String...args){
            rectangle r1=new rectangle();
              rectangle r2=new rectangle(5,6);
                rectangle r3=new rectangle(r1);
                  rectangle r4=new rectangle(r2);
                  r1.display();
                  r2.display();
                  r3.display();
                  r4.display();
  }
}
