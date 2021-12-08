import java.util.Scanner;

public class T3_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("m1 = ");
		double m1 = in.nextDouble();
		System.out.print("m2 = ");
		double m2 = in.nextDouble();
		System.out.print("r = ");
		double r = in.nextDouble();
		double y = 0.673E-12;
		double F = y * (m1 * m2) / Math.pow(r, 2);
		System.out.printf("F = %E H\n", F);
		in.close();
	}
}