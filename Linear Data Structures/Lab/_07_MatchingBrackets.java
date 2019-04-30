package _05_linearDataStructures_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _07_MatchingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        ArrayDeque<Integer> exprStack = new ArrayDeque<>();

        int startIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                exprStack.push(i);
            } else if (ch == ')') {
                startIndex = exprStack.pop();
                String subExpr = input.substring(startIndex, i + 1);
                System.out.println(subExpr);
            }
        }
    }
}

//100