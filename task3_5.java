public class T3_5 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}

		int left = 0;
		int right = 4;
		int i = left + 1;
		int swap;
		int j = 0;
		while (i <= right) {
			j = i;
			while (j > left) {
				if (arr[j - 1] <= arr[j]) break;
				swap = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = swap;
				j--;
			}
			i++;
		}
		System.out.println("Median: " + arr[2]);
	}
}