import java.util.Scanner;

public class T2_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		System.out.printf("%s = bin(%d)\n", Integer.toBinaryString(n), n);
		int ans = ((n<<1)^(n>>7&1))&0b01111111;
		System.out.printf("Answer: %s = bin(%d)\n", Integer.toBinaryString(ans), ans);
		in.close();
	}
}
