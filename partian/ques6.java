class ques6{
  public static void main(String[] args) {
int fib1 = 1;
int fib2 = 0;
int sum = fib1 + fib2;
int count = 0;
for(int i=1; i<=9; ++i){
fib1 = fib2;
fib2 = sum;
sum = fib1 + fib2;
if(sum*8 > 40)
++count;
}
System.out.print(sum * count);
}
}


//output 275
