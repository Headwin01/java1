import java.util.Random;

 
public class T3_6 {
	static Random rnd = new Random();

	static int coin1, coin2;
	
	public static void nextFlip() {
		coin1 = coin2;
		coin2 = rnd.nextInt(2);
	}
	
	public static int simulate(String p) {
		int cnt = 2;
		coin1 = rnd.nextInt(2);
		coin2 = rnd.nextInt(2);
		if ("Alice".equals(p)) {
			while (coin1 + coin2 != 2) {
				nextFlip();
				cnt++;
			}
		} else if ("Bob".equals(p)) {
			while (coin1 <= coin2) {
				nextFlip();
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int n = 10000;
		double cnt = 0;
		for (int i = 0; i < n; i++) {
			if (simulate("Alice") < simulate("Bob")) cnt++;
		}
		System.out.println("Ймовірність: " + cnt / n);
		System.out.printf("39/121 = %.5f\n", 39.0/121.0);
	}
}

