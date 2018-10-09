import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	static int[][] ar = new int[3][3];
	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in);
	static int cValue = 2;

	public static boolean tCase(int[][] ar) {
		boolean b = false;
		if (ar[0][0] == 1 && ar[0][1] == 1 && ar[0][2] == 1) {
			b = true;
		}
		if (ar[1][0] == 1 && ar[1][1] == 1 && ar[1][2] == 1) {
			b = true;
		}
		if (ar[2][0] == 1 && ar[2][1] == 1 && ar[2][2] == 1) {
			b = true;
		}
		if (ar[0][0] == 1 && ar[1][0] == 1 && ar[2][0] == 1) {
			b = true;
		}
		if (ar[0][1] == 1 && ar[1][1] == 1 && ar[2][1] == 1) {
			b = true;
		}
		if (ar[0][2] == 1 && ar[1][2] == 1 && ar[2][2] == 1) {
			b = true;
		}
		if (ar[0][0] == 1 && ar[1][1] == 1 && ar[2][2] == 1) {
			b = true;
		}
		if (ar[0][2] == 1 && ar[1][1] == 1 && ar[2][0] == 1) {
			b = true;
		}
		return b;
	}

	public static boolean tCaseC(int[][] ar) {
		boolean b = false;
		if (ar[0][0] == 2 && ar[0][1] == 2 && ar[0][2] == 2) {
			b = true;
		}
		if (ar[1][0] == 2 && ar[1][1] == 2 && ar[1][2] == 2) {
			b = true;
		}
		if (ar[2][0] == 2 && ar[2][1] == 2 && ar[2][2] == 2) {
			b = true;
		}
		if (ar[0][0] == 2 && ar[1][0] == 2 && ar[2][0] == 2) {
			b = true;
		}
		if (ar[0][1] == 2 && ar[1][1] == 2 && ar[2][1] == 2) {
			b = true;
		}
		if (ar[0][2] == 2 && ar[1][2] == 2 && ar[2][2] == 2) {
			b = true;
		}
		if (ar[0][0] == 2 && ar[1][1] == 2 && ar[2][2] == 2) {
			b = true;
		}
		if (ar[0][2] == 2 && ar[1][1] == 2 && ar[2][0] == 2) {
			b = true;
		}
		return b;
	}

	public static boolean userIntput() {
		System.out.println("enter x");
		int x = sc.nextInt();
		System.out.println("enter y");
		int y = sc.nextInt();
		if (x < 1 || x > 3 || y < 0 || y > 3 || ar[x - 1][y - 1] != 0) {
			return false;
		}

		ar[x - 1][y - 1] = 1;
		return true;
	}

	public static boolean computerInput() {
		int x = rd.nextInt(3);
		int y = rd.nextInt(3);

		if (ar[x][y] != 0) {
			return false;
		}
		ar[x][y] = cValue;
		return true;
	}

	public static void main(String[] args) {
		System.out.println("entre value of x and y between 1 and 3");
		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 0) {
				while (!userIntput()) {
					System.out.println("invalid location");
				}
			} else {
				while (!computerInput()) {
				}
			}

			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					System.out.print(ar[j][j2] + " ");
				}
				System.out.println();
			}
			System.out.println();

			if (tCase(ar)) {
				System.out.println("user win ");
				break;
			}
			if (tCaseC(ar)) {
				System.out.println("computer win");
				break;
			}
			if (i == 9) {
				System.out.println("draw");
			}
		}
	}
}
