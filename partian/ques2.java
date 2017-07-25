class ques2{
  public static void main(String[] args) {

int num = 2194;
int rev = 0;
while(num > 0){
rev = rev + num % 10;
num /= 10;
}
System.out.print(rev);
}
}



//Output  16
//logic 
