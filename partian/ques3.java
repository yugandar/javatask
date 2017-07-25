class ques3{
public static void main(String[] args) {


int num1 = 26 ;
int num2 = 45 ;
int num3 = 55 ;
int largest = 0;
int secLargest = 0;
if(num1 > num2){
largest = num1;
secLargest = num2;
}
else{
largest = num2;
secLargest = num1;
}
if(num3 > largest){
largest = num3;
secLargest = largest;
}
else if (num3 > secLargest)
secLargest = num3;
System.out.printf("%d",(largest + secLargest) % num1);
}
}


//Output 6

//  largest=55
//secLargest=55
//55+55=110
//110%26=6
