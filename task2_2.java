import java.util.Scanner;

public class T2_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a = ");
		byte a = in.nextByte();
		System.out.println("Знаковий зсув вправо");
		byte a1 = a;
		while (a1 != 0) {
			System.out.println(Integer.toBinaryString(a1));
			a1 = (byte)(a1>>1);
		}
		System.out.println("Зсунемо вліво на 2 позиції");
		a1 = a;
		a1 = (byte)(a1<<2);
		System.out.println(Integer.toBinaryString(a1));
		
		System.out.println("Беззнаковий зсув вправо");
		while (a1 != 0) {
			System.out.println(Integer.toBinaryString(a1));
			a1 = (byte)(a1>>>1);
		}
		in.close();
	}
}
