import java.util.Scanner;

public class PowerOf2 {

	public static void table(int n) {
		for (int i = 0; i < n; i++) {
			int tb = (int) Math.pow(2, i + 1);
			System.out.println(tb);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 0 && n <= 31) {
			table(n);
		} else {
			System.out.println("enter value 0 to 31");
		}
		sc.close();
	}
}
