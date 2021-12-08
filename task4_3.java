
public class T4_3 {
	public static double Rosenbrock2d(double x, double y) {
		return 100 * Math.pow(Math.pow(x, 2) - y, 2) + Math.pow(x - 1, 2);
	}
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			double a1 = Math.random() * 10;
			double a2 = Math.random() * 10;
			System.out.printf("Rosenbrock2d(%.3f, %.3f) = %.3f\n", a1, a2, Rosenbrock2d(a1, a2));
		}
	}
}
