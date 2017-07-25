class Single{
  private static Single single_obj=null;
  public String s;
  private Single(){
    s="iam singleton oject";
  }
  public static Single getInstance(){
    if(single_obj == null){
      single_obj = new single();
      return single_obj;

    }
  }
  class Main1{
    public static void main(String[] args) {
      Single x = Single.getInstance();
        Single y = Single.getInstance();
          Single z = Single.getInstance();
          x.s = (x.s).toUpperCase();

          System.out.println("String from x is " + x.s);
          System.out.println("String from y is " + y.s);
          System.out.println("String from z is " + z.s);
          System.out.println("\n");

  
          z.s = (z.s).toLowerCase();

          System.out.println("String from x is " + x.s);
          System.out.println("String from y is " + y.s);
          System.out.println("String from z is " + z.s);

    }
  }
}
