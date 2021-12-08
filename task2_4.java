import java.util.Scanner;

public class T2_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		System.out.print("m = ");
		int m = in.nextInt();
		int ans = n^(1<<m);
		System.out.printf("%s = bin(%d)\n", Integer.toBinaryString(n), n);
		System.out.printf("Answer: %s = bin(%d)\n", Integer.toBinaryString(ans), ans);
		in.close();
	}
}