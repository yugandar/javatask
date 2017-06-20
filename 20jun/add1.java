class add1{
static int add(int...a){
 int sum=0;
for(int i=0;i<a.length;i++)
{
  sum+=a[i];

}return sum;
}

public static void main(String...args){

    System.out.println(add(1));
    System.out.println(add(3,6));
    System.out.println(add(5,7,9,10));
}
}
