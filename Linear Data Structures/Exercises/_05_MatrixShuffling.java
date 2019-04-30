package _06_linearDataStructures_Exercises;

import java.util.Scanner;

public class _05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            String[] line = sc.nextLine().split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = line[j];
            }
        }

        String command = "";
        while (!"END".equals(command = sc.nextLine())) {
            String[] data = command.split("\\s+");

            if (data.length != 5 || !data[0].equals("swap")) {
                System.out.println("Invalid input!");
            } else {
                try {
                    int firstRowIndex = Integer.parseInt(data[1]);
                    int firstColIndex = Integer.parseInt(data[2]);
                    int secondRowIndex = Integer.parseInt(data[3]);
                    int secondColIndex = Integer.parseInt(data[4]);

                    String temp1 = matrix[secondRowIndex][secondColIndex];

                    matrix[secondRowIndex][secondColIndex] = matrix[firstRowIndex][firstColIndex];
                    matrix[firstRowIndex][firstColIndex] = temp1;

                    printMatrix(matrix);
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//100
