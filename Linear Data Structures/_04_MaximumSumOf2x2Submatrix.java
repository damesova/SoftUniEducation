package _05_linearDataStructures_Lab;

import java.util.Scanner;

public class _04_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dim = sc.nextLine().split(", ");
        int rows = Integer.parseInt(dim[0]);
        int cols = Integer.parseInt(dim[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] data = sc.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(data[col]);
            }
        }

        int bestRowIndex = 0;
        int bestColIndex = 0;
        int sumMax = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {

                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (sum > sumMax) {
                    sumMax = sum;
                    bestRowIndex = row;
                    bestColIndex = col;
                }
            }
        }

        System.out.println(matrix[bestRowIndex][bestColIndex] + " " + matrix[bestRowIndex][bestColIndex + 1]);
        System.out.println(matrix[bestRowIndex + 1][bestColIndex] + " " + matrix[bestRowIndex + 1][bestColIndex + 1]);

        System.out.println(sumMax);
    }
}

//100
