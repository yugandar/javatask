static boolean primes(int n){
  if(n<2)return false;
  for(int i=0;i<=n/2;i++)
  {
  if(n%i==0) return false;
}

return true;

}
class prime{
  public static void main(String...args){
    for(int i=0;i<100;i++){
      if(primes(i)){
      System.out.println(i);

    }
  }
}
