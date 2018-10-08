import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x");
		int x = sc.nextInt();
		System.out.println("enter y");
		int y = sc.nextInt();

		double distance = Math.pow((x * x + y * y), 0.5);
		System.out.println("Distance of (x,y) from (0,0) " + distance);

		sc.close();
	}
}
