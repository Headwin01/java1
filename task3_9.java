import java.util.Scanner;

public class T3_9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a = ");
		float a = in.nextFloat();
		System.out.print("b = ");
		float b = in.nextFloat();
		System.out.printf("a - b = %.3f\n", a - b);
		System.out.printf("a * b = %.3f\n", a * b);
		in.close();
	}
}