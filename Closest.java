import java.util.Scanner;


public class Closest {
	static double[] A;
	static double[] best_point = {Double.NaN, Double.NaN, Double.NaN};

	static double best_dist = Double.POSITIVE_INFINITY;
	static double[] coords_to_double(String s) {
		s = s.replace("(", "").replace(")", "");
		String[] B = s.split(",", 3);
		double[] B_double = new double[3];
		for (int i = 0; i < B.length; i++) {
			B_double[i] = Double.parseDouble(B[i]);
		}
		return B_double;
	}
	
	
	static void checkDistance(double[] B) {
		double dist = Math.pow(A[0] - B[0], 2) + Math.pow(A[1] - B[1], 2) + Math.pow(A[2] - B[2], 2);
		if (dist < best_dist) {
			best_dist = dist;
			for (int i = 0; i < B.length; i++) 
				best_point[i] = B[i];
		}		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("A: ");
		A = coords_to_double(in.nextLine());
		
		int i = 1;
		String str = "";
		while (!"-".equals(str)) { 
			System.out.printf("B%d: ", i);
			str = in.nextLine();
			if ("-".equals(str))
				continue;
			double[] B = coords_to_double(str);
			checkDistance(B);
			i++;
		}
		System.out.printf("Closest point = (%f, %f, %f)\n", best_point[0], best_point[1], best_point[2]);
		in.close();
	}
}