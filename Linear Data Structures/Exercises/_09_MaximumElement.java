package _06_linearDataStructures_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class _09_MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countCom = Integer.parseInt(reader.readLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> helper = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < countCom; i++) {
            String[] input = reader.readLine().split(" ");
            switch (input[0]) {
                case "1":
                    int value = Integer.parseInt(input[1]);
                    if (max <= value) {
                        max = value;
                        helper.push(max);
                    }
                    stack.push(value);
                    break;
                case "2":
                    if (stack.pop() == max) {
                        helper.pop();
                        if (helper.size() > 0) {
                            max = helper.peek();
                        } else {
                            max = Integer.MIN_VALUE;
                        }
                    }
                    break;
                case "3":
                    sb.append(max).append(System.lineSeparator());
                    //System.out.println(max); -> time limit error
                    break;
            }
        }
        System.out.println(sb);
    }
}

//100