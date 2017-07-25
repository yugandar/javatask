class ques5{
  public static void main(String[] args) {
int a = 29;
int b = 38;
int sum = 0;
int val = 0;
int temp = 0;
int rem = 0;
for(int i = a + 1; i < b; ++i)
{
temp = i;
while(temp != 0){
rem = temp % 10;
val = val + (rem ^ 3);
temp = temp / 10;
}
sum = sum + i;
}
System.out.print(sum);
}
}
//output 268
