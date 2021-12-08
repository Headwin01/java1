public class T2_3 {
	public static String char_to_bin(char a) {
		return Integer.toBinaryString(a);
	}
	public static void main(String[] args) {
		char[] chars = {'a', 'b', 'c'};
		for (char sym : chars) {
			System.out.printf("bin(%c) = %s\n", sym, char_to_bin(sym));
		}
	}
}
