import java.util.Scanner;

public class WindChill {
	public static void result(double t, double v) {
		double w = 35.74 + (0.6215 * t) + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println(w);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature in Fahrenheit");
		double t = sc.nextDouble();
		System.out.println("enter wind speed");
		double v = sc.nextDouble();
		result(t, v);
		sc.close();
	}
}
