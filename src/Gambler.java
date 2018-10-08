import java.util.Random;
import java.util.Scanner;

public class Gambler {

	public static void result(int n, int rs, int goal) {
		Random rd = new Random();
		int win = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			int temp = rs;

			while (temp != goal && temp != 0) {
				int wl = rd.nextInt(2);
				count++;
				if (wl == 1) {
					temp++;
				} else {
					temp--;
				}
			}

			if (temp == goal) {
				win++;
			}
		}

		System.out.println("no of win " + win);
		System.out.println("count " + count);
		System.out.println("win percentage " + (1.0 * win / n) * 100 + "%");
		System.out.println("loss percentage " + (((n - (1.0 * win)) / n) * 100) + "%");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of bet");
		int n = sc.nextInt();
		System.out.println("enter Stack");
		int rs = sc.nextInt();
		System.out.println("enter goal");
		int goal = sc.nextInt();
		result(n, rs, goal);
		sc.close();
	}
}
