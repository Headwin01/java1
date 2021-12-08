import java.util.Scanner;


public class T1_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		
		double[] numArray = new double[n];
		double sum = 0;
		System.out.print("Your numbers: ");
		for (int i = 0; i < n; i++) {
			numArray[i] = in.nextDouble();
			sum += numArray[i];
		}
		double mean = sum / n;
		System.out.println("Mean: " + mean);
		
		double standardDeviation = 0.0;
		for (double num: numArray) {
			standardDeviation += Math.pow(num - mean, 2);
		}
		System.out.println("Standard deviation: " + Math.sqrt(standardDeviation / n));
	}
}