class exception{
  public static void main(String[] args) {
    try {
       System.out.println("try exceuted");
       System.exit(0);
    }

    finally{

      System.out.println("this block is always exceuted");
        System.exit(1);
    }
  }
}
