import java.util.Scanner;

public class Quadratic {

	public static void root(int a, int b, int c) {
		int delta = Math.abs(b * b - 4 * a * c);
		System.out.println(delta);
		double root1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
		double root2 = (-b - Math.pow(delta, 0.5)) / (2 * a);

		System.out.println(root1 + "   " + root2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		System.out.println("enter c");
		int c = sc.nextInt();
		root(a, b, c);
		sc.close();
	}
}
