package _05_linearDataStructures_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _06_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        if (num == 0) {
            System.out.println(0);
        } else {
            ArrayDeque<Integer> stack = new ArrayDeque<>();

            while (num != 0) {
                stack.push(num % 2);
                num /= 2;
            }

            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
        }
    }
}

//100