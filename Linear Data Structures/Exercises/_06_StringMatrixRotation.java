package _06_linearDataStructures_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] command = sc.nextLine().split("[()]");
        int degrees = Integer.parseInt(command[1]) % 360;
        List<String> elements = new ArrayList<>();

        String input = "";
        int maxLength = 0;
        while (!"END".equals(input = sc.nextLine())) {
            elements.add(input);
            if (input.length() > maxLength) {
                maxLength = input.length();
            }
        }

        char[][] matrix = new char[elements.size()][maxLength];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < maxLength; j++) {
                if (elements.get(i).length() <= j) {
                    matrix[i][j] = ' ';
                } else {
                    matrix[i][j] = elements.get(i).charAt(j);
                }
            }
        }

        if (degrees == 90) {
            printMatrix(rotate90(matrix));
        } else if (degrees == 180) {
            printMatrix(rotate180(matrix, maxLength));
        } else if (degrees == 270) {
            printMatrix(rotate270(matrix));
        } else {
            printMatrix(matrix);
        }
    }

    private static char[][] rotate270(char[][] matrix) {
        int rowsRotatedMatrix = matrix[0].length;
        int colsRotatedMatrix = matrix.length;
        char[][] rotatedMatrix = new char[rowsRotatedMatrix][colsRotatedMatrix];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotatedMatrix[(rowsRotatedMatrix - 1) - j][i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    private static char[][] rotate180(char[][] matrix, int maxLength) {
        char[][] rotatedMatrix = new char[matrix.length][maxLength];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < maxLength; col++) {
                rotatedMatrix[row][col] = matrix[matrix.length - row - 1][maxLength - col - 1];
            }
        }
        return rotatedMatrix;
    }

    private static char[][] rotate90(char[][] matrix) {
        int rowsRotatedMatrix = matrix[0].length;
        int colsRotatedMatrix = matrix.length;
        char[][] rotatedMatrix = new char[rowsRotatedMatrix][colsRotatedMatrix];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotatedMatrix[j][(colsRotatedMatrix - 1) - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

//100
