import java.util.Scanner;

public class HarmonicNumber {
	public static double cal(int n) {
		double temp = 0;
		for (double i = 1; i <= n; i++) {
			temp = temp + (1 / i);
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println(cal(n));
		sc.close();
	}
}
