package _06_linearDataStructures_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _12_BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] characters = sc.nextLine().toCharArray();

        if (characters.length % 2 != 0) {
            System.out.println("NO");
            return;
        }

        ArrayDeque<Character> openStack = new ArrayDeque<>();
        boolean isBalanced = true;
        for (Character ch : characters) {
            if (ch == '{' || ch == '[' || ch == '(') {
                openStack.push(ch);
            } else {
                char currCh = openStack.pop();
                if (ch == '}') {
                    ch = '{';
                }
                if (ch == ']') {
                    ch = '[';
                }
                if (ch == ')') {
                    ch = '(';
                }

                if (ch != currCh) {
                    System.out.println("NO");
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced) {
            System.out.println("YES");
        }
    }
}

//100