import java.util.Scanner;

public class T3_8 {
	static DecimalFormat format = new DecimalFormat("#.###");
	static int n = 3; // округлятимемо до n знаків після коми
	
	public static void test_with_math(float x) {
		System.out.println("За допомогою математичних функцій:");
		System.out.printf("x = %d + %f\n", Math.round(x), x - Math.round(x));
		System.out.printf("%d < x < %d\n", (int)Math.ceil(x - 1), (int)Math.floor(x + 1));
		System.out.printf("%f ≈ %s\n", x, format.format(Math.round(x * Math.pow(10, n)) / Math.pow(10, n)));
	}
	
	public static void test_without_math(float x) {
		System.out.println("Без математичних функцій:");
		int n_10 = 1;
		for (int i = 0; i < n; i++)
			n_10 *= 10;
		System.out.printf("x = %d + %f\n", (int)x, x % 1);
		int a, b, k;
		if (x == 0) {
			a = -1;
			b = 1;
			k = 1;
		} else if (x < 0) {
			a = (int)(x - 1);
			b = (int)(x + 1.0/n_10);
			k = -1;
		} else {
			a = (int)(x - 1.0/n_10);
			b = (int)(x + 1);
			k = 1;
		}
		System.out.printf("%d < x < %d\n", a, b);
		System.out.printf("%f ≈ %s\n", x, format.format((float)((int)(x * n_10 + k * 0.5)) / n_10));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("x = ");
		float x = in.nextFloat();
		test_with_math(x);
		test_without_math(x);
		in.close();
	}
}
