class ques9{
  public static void main(String[] args) {

int a = 2;
int b = 3;
int c = 5;
int val = 15;
int sum = 0;
for(int i = 1; a<val && b<val && c<val; i++){
if(i%3 == 0){
c += 3 ;
}
else if(i%2 == 0){
b += 3 ;
}
else{
a ++;
}
sum = sum + a + b + c;
}
System.out.print(sum);
}
}
//output 225
