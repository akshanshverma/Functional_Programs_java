import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
	public static void primeFactors(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 2;
		while (n != 1) {
			boolean b = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}

			if (b) {
				while (n % i == 0) {
					al.add(i);
					n = n / i;
				}
			}
			i++;
		}

		for (Integer integer : al) {
			System.out.println(integer);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		int n = sc.nextInt();
		primeFactors(n);
		sc.close();
	}
}
