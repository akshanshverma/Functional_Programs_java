import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter pr = new PrintWriter(System.out);

	public static int[][] intAr(int m, int n) {
		int[][] ar = new int[m][n];
		System.out.println("int array value");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		return ar;
	}

	public static double[][] doubleAr(int m, int n) {
		double[][] ar = new double[m][n];
		System.out.println("enter double type array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				ar[i][j] = sc.nextDouble();
			}
		}
		return ar;
	}

	public static boolean[][] booleanAr(int m, int n) {
		boolean[][] ar = new boolean[m][n];
		System.out.println("enter boolean type array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				ar[i][j] = sc.nextBoolean();
			}
		}
		return ar;
	}

	public static void prinfAr(int[][] arI, double[][] arD, boolean[][] arB, int n, int m) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pr.print(arI[i][j] + " ");
				pr.flush();
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pr.print(arD[i][j] + " ");
				pr.flush();
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pr.print(arB[i][j] + " ");
				pr.flush();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("enter no of row");
		int m = sc.nextInt();
		System.out.println("enter no of colums");
		int n = sc.nextInt();
		prinfAr(intAr(m, n), doubleAr(m, n), booleanAr(m, n), n, m);

	}
}
