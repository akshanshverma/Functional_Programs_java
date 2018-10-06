import java.util.Random;

public class FlipCoin {
	public static void flip(int n) {
		int z = 0;
		int o = 0;
		for (int i = 0; i < n; i++) {
			Random rd = new Random();
			int r = rd.nextInt(2);

			if (r == 1) {
				z++;
			} else {
				o++;
			}
		}

		int H = (z * 100) / n;
		System.out.println("Head " + H + "%");
		int T = (o * 100) / n;
		System.out.println("Tails " + T + "%");
	}

	public static void main(String[] args) {
		flip(15);
	}
}
