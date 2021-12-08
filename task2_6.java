import java.util.Scanner;


public class T2_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int a = in.nextInt();
		System.out.printf("bin(%d) = %s\n", a, Integer.toBinaryString(a));
		int cnt = 0;
		int n = Integer.toBinaryString(a).length();
		while (n > 1) {
			if ((a&0b11) == 0b11) cnt++;
			a = a>>1;
			n = Integer.toBinaryString(a).length();
		}
		System.out.printf("11 зустрічається %d разів.\n", cnt);
		in.close();
	}
}