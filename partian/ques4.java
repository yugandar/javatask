class ques4{
  public static void main(String[] args) {
int n = 28;
int value = 0;
int i = 0;
while(n >= 1)
{
value = value + (n % 2) * 2^i;
n = n / 2;
i = i + 2;
}
System.out.println(value);
}
}
//output   14
