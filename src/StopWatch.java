import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		double start = 0, stop = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to start watch");
		System.out.println("press 2 to stop watch");
		int s = sc.nextInt();
		if (s == 1) {
			start = System.currentTimeMillis() / 1000.0;
		}
		int sp = sc.nextInt();

		if (sp == 2) {
			stop = (System.currentTimeMillis() / 1000.0) - start;
		}

		System.out.println(stop + " second");
		sc.close();
	}
}
