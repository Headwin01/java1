package task29;

import java.util.Scanner;

public class task29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        addElem(matrix);
        //addrandomElem(matrix,size);
        print(matrix);
        action(matrix);
        print(matrix);
    }

    public static void action(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] -= getAvgInArray(array[i]);
            }
        }
    }

    public static void addrandomElem(int[][] array, int num){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int)(Math.random()*(2*num+1)) - num;
            }
        }
    }

    public static void addElem(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void print(int[][] array){
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
    }
    public static double getAvgInArray(int[] array) {
        int sum = 0;
        for (int a: array) {
            sum+= a;
        }
        return (double)sum/array.length;
    }
}
