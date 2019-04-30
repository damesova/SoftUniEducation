package _06_linearDataStructures_Exercises;

import java.util.Scanner;
import java.util.Stack;

public class _15_InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();

        System.out.println(infixToPostfix(infix));
    }

    static String infixToPostfix(String infix) {
        /* To find out the precedence, we take the index of the
           token in the ops string and divide by 2 (rounding down).
           This will give us: 0, 0, 1, 1, 2 */
        final String ops = "-+/*";

        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();

        for (String token : infix.split("\\s")) {
            if (token.isEmpty())
                continue;
            char ch = token.charAt(0);
            int ind = ops.indexOf(ch);

            // check for operator
            if (ind != -1) {
                if (s.isEmpty()) {
                    s.push(ind);
                } else {
                    while (!s.isEmpty()) {
                        int prec2 = s.peek() / 2;
                        int prec1 = ind / 2;
                        if (prec2 > prec1 || (prec2 == prec1)) {
                            sb.append(ops.charAt(s.pop())).append(' ');
                        } else {
                            break;
                        }
                    }
                    s.push(ind);
                }
            } else if (ch == '(') {
                s.push(-2); // -2 stands for '('
            } else if (ch == ')') {
                // until '(' on stack, pop operators.
                while (s.peek() != -2) {
                    sb.append(ops.charAt(s.pop())).append(' ');
                }
                s.pop();
            } else {
                sb.append(token).append(' ');
            }
        }
        while (!s.isEmpty()) {
            sb.append(ops.charAt(s.pop())).append(' ');
        }
        return sb.toString();
    }
}

//100

