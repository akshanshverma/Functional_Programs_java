import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
	public static void cp(int n) {
		ArrayList<String> al = new ArrayList<String>();
		Random rd = new Random();
		int i = 0;
		int count = 0;
		while (i != n) {
			count++;
			int num = rd.nextInt(n + 100);
			if (!al.contains("cou" + num + "pon")) {
				al.add("cou" + num + "pon");
				i++;
			}
		}
		System.out.println(count + " count");
		for (String integer : al) {
			System.out.println(integer);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many coupon u wnat?");
		int n = sc.nextInt();
		cp(n);
		sc.close();
	}
}
