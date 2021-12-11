package tasks;

import java.util.Scanner;

public class task41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите х: ");
        int x = scanner.nextInt();
        System.out.println("Значение функции: " + function(x));
    }

    public static double function(int x) {
        return Math.pow(x,9) + Math.pow(x,3) + 1;
    }
}
