import java.util.Scanner;

public class BiggestNumberUsingif {
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner bn = new Scanner(System.in);
		System.out.println("The four numbers are");
		a = bn.nextInt();
		b = bn.nextInt();
		c = bn.nextInt();
		d = bn.nextInt();
		if (a > b && a > c && a > d) {
			System.out.println("the biggest number is=" + a);
		} else if (b > a && b > c && b > d) {
			System.out.println("the biggest number is=" + b);

		} else if (c > a && c > b && c > d) {
			System.out.println("the biggest number is=" + c);

		} else {
			System.out.println("the biggest number is=" + d);

		}

	}

}
