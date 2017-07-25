class ques7{
  public static void main(String[] args) {

int sum = 0;
int i;
int j = 0;
for ( i=2; i<=7; i++){
for(j=i; j>=0; --j){
sum = sum + (i * j);
}
}
System.out.print(sum + i * j);
}
}
//output 453
