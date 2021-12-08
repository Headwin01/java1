import java.util.Scanner;


public class T4_20a {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("x = ");
		double x = in.nextDouble();
		double term = x, eps = 0.001, sum = 0, pow = x;
		int n = 1, fact = 1, k = 1;
		
		while (term * term > eps * eps) {
			sum += term;
			fact *= (n + 1) * (n + 2);
			pow *= x * x;
			k *= -1;
			n += 2;
			term = k * pow / fact;
		}
		System.out.println("sin(x) =" + sum);
		System.out.println("Math.sin(x) = " + Math.sin(x));
		in.close();
	}
}

