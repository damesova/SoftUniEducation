package _05_linearDataStructures_Lab;

import java.util.*;

public class _05_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        ArrayDeque<String> calc = new ArrayDeque<>();
        Collections.addAll(calc, input);

        while (calc.size() > 1) {
            int first = Integer.parseInt(calc.pop());
            String operand = calc.pop();
            int second = Integer.parseInt(calc.pop());

            if (operand.equals("+")) {
                calc.push("" + (first + second));
            } else {
                calc.push("" + (first - second));
            }
        }
        System.out.println(calc.peek());
    }
}

//100
