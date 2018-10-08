import java.util.Scanner;

public class AddsToZero {
	public static void cal(int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				for (int j2 = j + 1; j2 < ar.length; j2++) {
					if (ar[i] + ar[j] + ar[j2] == 0) {
						System.out.println(ar[i] + " + " + ar[j] + " + " + ar[j2] + " = 0");
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("enter values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		cal(ar);
		sc.close();
	}
}
