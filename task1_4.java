import java.util.Scanner;


public class T1_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Your numbers: ");
		String s = in.nextLine();
		String[] str_arr = s.split(" ");
		int[] arr = new int[str_arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		
		int max_len = 1;
		int len = 1;
		int n = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				if (max_len < len) {
					max_len = len;
					n = arr[i - 1];
				}
				len = 1;
			} else len++;
		}
		System.out.printf("n, Max length:", n, max_len);
		in.close();
	}
}