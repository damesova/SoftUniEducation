package _05_linearDataStructures_Lab;

import java.util.Scanner;

public class _03_SumMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]); // = matrix.length
        int cols = Integer.parseInt(input[1]); // = matrix[0].length

        int[][] matrix = new int[rows][cols];

        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            String[] data = sc.nextLine().split(", ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = Integer.parseInt(data[col]);
                sum += matrix[row][col];    // matrix way
                //sum += Integer.parseInt(data[col]); -> general way
            }
        }

        System.out.println(matrix.length);  //matrix way
        //System.out.println(rows); -> general way
        System.out.println(matrix[0].length);  //matrix way
        //System.out.println(cols); -> general way
        System.out.println(sum);
    }
}

//100
