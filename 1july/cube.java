import java.util.Scanner;
class cube{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer:");
		int  n=sc.nextInt();
	//	System.out.println("you entered:");
		int a=0;
				for(int i=1;i<=n;i++){
					a=a+(i*i*i);
				}
System.out.println(a);
	}
}
