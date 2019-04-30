package _06_linearDataStructures_Exercises;

import java.util.Scanner;

public class _13_RecursiveFibonacci {

    private static long[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        memo = new long[n + 1];

        System.out.println(recFibWithMemoization(n));
    }

    private static long recFibWithMemoization(int n) {
        if (n <= 1) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] =
                recFibWithMemoization(n - 1) +
                        recFibWithMemoization(n - 2);
        return memo[n];
    }
}

//100
