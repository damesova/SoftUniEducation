package _06_linearDataStructures_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _08_BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inp = sc.nextLine().split("\\s+");
        int countElPush = Integer.parseInt(inp[0]);
        int countElPop = Integer.parseInt(inp[1]);
        int num = Integer.parseInt(inp[2]);
        String[] nums = sc.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < countElPush; i++) {
            stack.push(Integer.parseInt(nums[i]));
        }

        for (int i = 0; i < countElPop; i++) {
            stack.pop();
        }

        if (stack.contains(num)) {
            System.out.println("true");
        } else {
            System.out.println(stack.stream().min(Integer::compareTo).orElse(0));
        }
    }
}

//100
