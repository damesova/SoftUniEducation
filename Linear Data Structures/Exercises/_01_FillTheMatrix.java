package _06_linearDataStructures_Exercises;

import java.util.Scanner;

public class _01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        if (pattern.equals("A")) {
            printMatrix(fillTypeA(n));
            System.out.println();
        } else if (pattern.equals("B")) {
            printMatrix(fillTypeB(n));
            System.out.println();
        }
    }

    private static int[][] fillTypeA(int n) {
        int[][] matrix = new int[n][n];
        int startNum = 1;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = startNum;
                startNum++;
            }
        }
        return matrix;
    }

    private static int[][] fillTypeB(int n) {
        int[][] matrix = new int[n][n];
        int startNum = 1;
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = startNum;
                    startNum++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = startNum;
                    startNum++;
                }
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//100

