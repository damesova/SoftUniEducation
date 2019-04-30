package _06_linearDataStructures_Exercises;

import java.util.Scanner;

public class _04_MaximalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("\\s+");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int bestRowIndex = 0;
        int bestColIndex = 0;
        int sumMax = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (sum > sumMax) {
                    sumMax = sum;
                    bestRowIndex = i;
                    bestColIndex = j;
                }
            }
        }
        System.out.println("Sum = " + sumMax);
        printMatrix(matrix, bestRowIndex, bestColIndex);

    }

    private static void printMatrix(int[][] matrix, int bestRowIndex, int bestColIndex) {
        for (int i = bestRowIndex; i < bestRowIndex + 3; i++) {
            for (int j = bestColIndex; j < bestColIndex + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//100


/* Another way for printing 3*3 matrix:
        System.out.println(matrix[bestRowIndex][bestColIndex]
                + " " + matrix[bestRowIndex][bestColIndex + 1]
                + " " + matrix[bestRowIndex][bestColIndex + 2]);
        System.out.println(matrix[bestRowIndex + 1][bestColIndex]
                + " " + matrix[bestRowIndex + 1][bestColIndex + 1]
                + " " + matrix[bestRowIndex + 1][bestColIndex + 2]);
        System.out.println(matrix[bestRowIndex + 2][bestColIndex]
                + " " + matrix[bestRowIndex + 2][bestColIndex + 1]
                + " " + matrix[bestRowIndex + 2][bestColIndex + 2]);
 */
