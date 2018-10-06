import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
	public static void primeFactors(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			boolean b = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b == true) {
				while (n % i == 0 && n != 0) {
					al.add(i);
					n = n/i;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		int n = sc.nextInt();

	}
}
