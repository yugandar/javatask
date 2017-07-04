import java.util.Scanner;

public class MultiflicationTable {
	public static void main(String[] args) {
		int n,j;
		Scanner mt=new Scanner(System.in);
		System.out.println("Enter the Table");
		n=mt.nextInt();
		System.out.println("table upto");
		j=mt.nextInt();
		for(int i=1;i<=j;i++){
			int c=n*i;
			System.out.println(i+"*"+n+"="+c);
		}
	}

}
