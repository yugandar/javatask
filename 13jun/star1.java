class star1{
static int i;

public static void main(String[] args) {
    // int i;
     for( i=0;i<5;i++) {
         for(int j=0;j<5;j++) {
           if((i+j<=6)&&(i>=j)||(i+j>=6)&&(i<=j)){
             System.out.print("*");
         }else{
            System.out.print("*");
        }

    }
      System.out.println();

}
}
}
