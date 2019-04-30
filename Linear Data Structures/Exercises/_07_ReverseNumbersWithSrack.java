package _06_linearDataStructures_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _07_ReverseNumbersWithSrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        //Stack place first el to last pos and continues ordering el in direction to 0 index:
        for (int i = 0; i < input.length; i++) {
            stack.push(Integer.parseInt(input[i]));
        }

        //when call forEach/print el are stored in proper order, so we don't need to sort output explicitly:
        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }
    }
}

//100
