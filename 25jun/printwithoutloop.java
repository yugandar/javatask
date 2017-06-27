class printwithoutloop{

  public static void main(String...args){
   m1(1);

}
    static void m1(int n){
      if(n<=10){
        System.out.println(n);
        m1(n+1);
      }

    }
  }
