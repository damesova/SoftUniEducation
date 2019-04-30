package _06_linearDataStructures_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _10_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inp = sc.nextLine().split("\\s+");
        int countElAdd = Integer.parseInt(inp[0]);
        int countElPoll = Integer.parseInt(inp[1]);
        int num = Integer.parseInt(inp[2]);
        String[] nums = sc.nextLine().split("\\s+");

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < countElAdd; i++) {
            queue.add(Integer.parseInt(nums[i]));
        }

        for (int i = 0; i < countElPoll; i++) {
            queue.poll();
        }

        if (queue.contains(num)) {
            System.out.println("true");
        } else {
            System.out.println(queue.stream().min(Integer::compareTo).orElse(0));
        }
    }
}

//100
