import java.util.Scanner;


public class T2_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Прізвище: ");
		String surname = in.nextLine();
		System.out.println(surname);
		in.close();
	}
}