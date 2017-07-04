import java.util.Scanner;
class prime{
	public static void main(String[] args) {
		int count;
		for (int i = 1; i <= 100; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}

			}
			if (count == 0) {
				System.out.println(i);
			}

		}
	}
}
