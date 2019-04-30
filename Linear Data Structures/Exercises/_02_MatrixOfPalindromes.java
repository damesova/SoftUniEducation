package _06_linearDataStructures_Exercises;

import java.util.Scanner;

public class _02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        String[][] palindrome = new String[r][c];

        for (int i = 0; i < palindrome.length; i++) {
            for (int j = 0; j < palindrome[i].length; j++) {

                char ch1 = (char) (i + 97);
                char ch2 = (char) (i + j + 97);
                char ch3 = (char) (i + 97);

                String el = "" + ch1 + ch2 + ch3;
                palindrome[i][j] = el;
            }
        }

        printMatrix(palindrome);
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

