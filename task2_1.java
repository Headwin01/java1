public class T2_1 {
	public static void main(String[] args) {
		final byte A = 0xa; // dec(A) = 10
		final byte B = 0x15; // dec(B) = 21
		System.out.println("A = " + Integer.toBinaryString(A));
		System.out.println("B = " + Integer.toBinaryString(B));
		System.out.println("A|B = " + Integer.toBinaryString(A|B));
		System.out.println("A^B = " + Integer.toBinaryString(A^B));
		System.out.println("A&B = " + Integer.toBinaryString(A&B));
		System.out.println("A>>>B = " + Integer.toBinaryString(A>>>B));
		System.out.println("B<<A = " + Integer.toBinaryString(A<<B));
	}
}
