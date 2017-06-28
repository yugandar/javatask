class person{
  String name;
  char gender;
  static int count;
       person(String n,char g){
         name=n;
         gender=g;
         count++;
       }

void dispaly(){
  System.out.println("name:"+name);
  System.out.println("gender:"+gender);

}
}

class man{
  public static void main(String...args){
        person  p1=new person("yugandar",'M');
        person  p2=new person("hemalatha",'F');
        p1.dispaly();
        p2.dispaly();
        System.out.println("counts"+person.count);

  }

}
