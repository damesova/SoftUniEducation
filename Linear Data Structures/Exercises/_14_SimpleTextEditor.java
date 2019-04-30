package _06_linearDataStructures_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _14_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayDeque<String> backward = new ArrayDeque<>();    //stack

        String text = "";
        for (int i = 0; i < n; i++) {

            String[] cmd = sc.nextLine().split(" ");

            switch (cmd[0]) {
                case "1":
                    backward.push(text);
                    text += cmd[1];
                    break;
                case "2":
                    backward.push(text);
                    int count = Integer.parseInt(cmd[1]);
                    for (int j = 0; j < count; j++) {
                        text = text.substring(0, text.length() - 1);
                    }
                    break;
                case "3":
                    int index = Integer.parseInt(cmd[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                    text = backward.pop();
                    break;
            }
        }
    }
}

//100

