import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Your numbers: ");
		String s = in.nextLine();
		String[] arr = s.split(" ");
		int max = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[0]);
		for (String a : arr) {
			int an = Integer.parseInt(a);
			if (an > max) max = an;
			if (an < min) min = an;
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		in.close();
	}
}