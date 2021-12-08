package com.univ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {
        int n;
        System.out.print("n = ");
        n = sc.nextInt();
        int[][] matr = inputRandomSquareMatrix(n);
        showMatrix(matr);
        System.out.println("-----------------");
        int max = findMax(matr, n), k = 0;
        int[] columns = new int[n];
        for(int i = 0; i < n; i++)
        {
            columns[i] = -1;
        }
        int[][] tmp1 = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            boolean f = true;
            for(int j = 0; j < n; j++)
            {
                if(matr[i][j] == max)
                {
                    f = false;
                    columns[k++] = j;
                    break;
                }
            }
            if(f)
                tmp1[i] = matr[i].clone();
        }
        showMatrix(tmp1);
        System.out.println("-----------------");
        int[][] tmp2 = new int[n][n];
        for (int j = 0; j < matr.length; j++) {
            if(find(columns, n, j))
                continue;
            for (int i = 0; i < matr.length; i++) {
                tmp2[i][j] = tmp1[i][j];
            }
        }
        showMatrix(tmp2);
    }

    static int[][] inputRandomSquareMatrix(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n * n; i++) {
            res[i / n][i % n] = rnd.nextInt(2 * n + 1) - n;
        }
        return res;
    }

    static void showMatrix(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(" " + matr[i][j]);
            }
            System.out.println();
        }
    }

    static int findMax(int[][] matr, int n){
        int max = matr[0][0];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(matr[i][j] > max)
                    max = matr[i][j];
            }
        }
        return max;
    }

    static boolean find(int matr[], int n, int x){
        for(int i = 0; i < n; i++)
        {
            if(matr[i] == x)
                return true;
        }
        return false;
    }
}
