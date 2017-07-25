class ques10{
  public static void main(String[] args) {

int a = 1;
int b = 0;
int sum = 0;
int cnt = 2;
int temp = 0;
int cal = 0;

for(int i = 1; a<=400; i++){
cal = 0;
temp = a;
while(temp!=0){
b = a % 10;
temp = temp / 10;
if(b == 0){
cal++;
}
}
if(cal == 0){
sum = sum + a;
}
a += (cnt * cnt);
cnt++;
}
System.out.print(sum);
}
}

//output 1040
