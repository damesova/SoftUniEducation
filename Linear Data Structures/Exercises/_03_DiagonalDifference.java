package _06_linearDataStructures_Exercises;

import java.util.Scanner;

public class _03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            String[] line = sc.nextLine().split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        int row = 0;
        int leftDiagonalCol = 0;
        int rightDiagonalCol = matrix.length - 1;

        while (row < matrix.length) {
            leftDiagonalSum += matrix[row][leftDiagonalCol];
            rightDiagonalSum += matrix[row][rightDiagonalCol];
            row++;
            leftDiagonalCol++;
            rightDiagonalCol--;
        }
        System.out.println(Math.abs(leftDiagonalSum-rightDiagonalSum));
    }
}

//100
